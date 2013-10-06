package org.kermeta.spem.parameterreader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.PlatformUI;
import org.kermeta.spem.behavior.AC;
import org.kermeta.spem.behavior.ACL;
import org.kermeta.spem.behavior.Action;
import org.kermeta.spem.behavior.JavaEclipseAction;
import org.kermeta.spem.behavior.PrimitiveAC;
import org.kermeta.spem.executioncontext.ExecutionContext;
import org.kermeta.spem.parameterreader.dialogs.ParameterDialog;
import org.kermeta.spem.parameterreader.dialogs.RedundantParametersDialog;
import org.kermeta.spem.processexecution.utils.model.ModelUtils;

public class ParameterReader {

	private static ArrayList<Map<String,String>> allParameters;

	public static void readParameters(AC ac, String contextModelPath){

		//Get the parameters
		ArrayList<Parameter> parameters = new ArrayList<Parameter>();
		allParameters = new ArrayList<Map<String,String>>();
		if(ac instanceof PrimitiveAC){
			parameters = readParametersPrimitiveAC((PrimitiveAC) ac, contextModelPath, parameters);
		} else if (ac instanceof ACL){
			parameters = readParametersACL((ACL) ac, contextModelPath, parameters);
		}

		//Check if parameters have the same name
		checkAllParameters();
		
		//Elimination of the redundant parameters
		parameters = eliminateRedundantParameters(parameters);

		//Ask for the values of the parameters to the current process actor, if the list of parameters is not empty
		if(!parameters.isEmpty()){
			ParameterDialog parameterDialog = new ParameterDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), parameters);
			parameterDialog.create();
			parameterDialog.open();
			parameters = parameterDialog.getParameters();	
		}

		//Save of the parameters into the context model if this is not already the case, and just modify their value otherwise
		ExecutionContext executionContext = ModelUtils.getExecutionContextRoot(contextModelPath);
		for(Parameter p: parameters){
			if(ModelUtils.existKey(p.getName(), executionContext)){
				ModelUtils.setValueOfKeyIntoExecutionContextModel(executionContext, p.getName(), p.getValue());
			}else{
				ModelUtils.addKeyValueIntoExecutionContextModel(executionContext, p.getName(), p.getValue());
			}
		}
	}

	public static void addKeyValueAllParameters(String key, String value){
		Map<String,String> m = new HashMap<String,String>();
		m.put(key, value);
		allParameters.add(m);
	}

	public static void checkAllParameters(){
		System.out.println("check all parameters");
		for(Map<String,String> m : allParameters){
			for(Entry<String, String> s : m.entrySet()){
				System.out.println("key = "+s.getKey());
				System.out.println("value = "+s.getValue());
			}
		}
		ArrayList<ArrayList<String>> redundantParameters = new ArrayList<ArrayList<String>>();
		for(int j = 0; j < allParameters.size(); j++){
			Boolean redundantParameter = false;
			String parameterToCheck = allParameters.get(j).keySet().iterator().next();
			for(int i = j+1; i < allParameters.size(); i++){
				ArrayList<String> a = new ArrayList<String>();
				if(allParameters.get(i).keySet().iterator().next().equals(parameterToCheck)){
					if(!redundantParameter){
						a.add(parameterToCheck);
						a.add(allParameters.get(j).values().iterator().next());
					}
					a.add(allParameters.get(i).values().iterator().next());
					System.out.println("print all parameters before removal");
					for(Map<String,String> m : allParameters){
						for(Entry<String, String> s : m.entrySet()){
							System.out.println("key = "+s.getKey());
							System.out.println("value = "+s.getValue());
						}
					}
					allParameters.remove(i);
					System.out.println("print all parameters after removal");
					for(Map<String,String> m : allParameters){
						for(Entry<String, String> s : m.entrySet()){
							System.out.println("key = "+s.getKey());
							System.out.println("value = "+s.getValue());
						}
					}
					redundantParameter = true;
				}
				
				if(a.size() > 0){
					redundantParameters.add(a);
				}
			}
		}
		
		System.out.println("redundant parameters");
		for(ArrayList<String> a : redundantParameters){
			System.out.println("An array : ");
			for(String s : a){
				System.out.println(s);
			}
		}
		
		if(redundantParameters.size()>0){
			RedundantParametersDialog redundantParameterDialog = new RedundantParametersDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), redundantParameters);
			redundantParameterDialog.create();
			redundantParameterDialog.open();
		}
	}

	public static ArrayList<Parameter> readParametersPrimitiveAC(PrimitiveAC primitiveAC, String contextModelPath, ArrayList<Parameter> parameters){
		Action action = primitiveAC.getAction();
		if(action instanceof JavaEclipseAction){
			JavaEclipseAction jEclipseAction = (JavaEclipseAction) action;
			String expression = jEclipseAction.getExpression();
			IExtension[] extensions = Platform.getExtensionRegistry().getExtensionPoint(org.kermeta.spem.activityautomationmanager.Activator.getDefault().PLUGIN_ID,"activityautomationregistry").getExtensions();
			//Look for the plug-in whose action equals expression, among the plug-ins extending the activityautomationregistry extension point
			for(int i = 0; i < extensions.length; i++){
				IConfigurationElement[] configElements = extensions[i].getConfigurationElements();
				for(int j = 0; j < configElements.length; j++){
					if(configElements[j].getAttribute("action").equals(expression)){//The plug-in whose action equals expression has been found
						String pluginName = extensions[i].getNamespaceIdentifier();
						//Look for the data corresponding to the parametermanagerregistry extension point of the plug-in whose action equals expression
						IExtension[] extensionsParameterManager = Platform.getExtensionRegistry().getExtensionPoint(org.kermeta.spem.parametermanager.Activator.getDefault().PLUGIN_ID,"parameterregistry").getExtensions();
						//To do that, find among the plug-ins extending the parametermanagerregistry extension point the one whose name equals pluginName
						for(int z = 0; z < extensionsParameterManager.length; z++){
							if(extensionsParameterManager[z].getNamespaceIdentifier().equals(pluginName)){//plug-in found
								IConfigurationElement[] configElementsParameterManager = extensionsParameterManager[z].getConfigurationElements();
								//Get the parameters of this plug-in, if they exist
								for(IConfigurationElement configElement : configElementsParameterManager){
									Parameter p = null;
									if(configElement.getAttribute("parameter_name") != null){
										p = new Parameter(configElement.getAttribute("parameter_name"),null,false);
										addKeyValueAllParameters(configElement.getAttribute("parameter_name"), extensionsParameterManager[z].getNamespaceIdentifier());
									}else if(configElement.getAttribute("confidential_parameter_name") != null){
										p = new Parameter(configElement.getAttribute("confidential_parameter_name"),null,true);
										addKeyValueAllParameters(configElement.getAttribute("confidential_parameter_name"), extensionsParameterManager[z].getNamespaceIdentifier());
									} 
									parameters.add(p);
								}
							}
						}
					}
				}
			}
		}
		return parameters;
	}

	public static ArrayList<Parameter> readParametersACL(ACL acl, String contextModelPath, ArrayList<Parameter> parameters){
		for(AC ac : acl.getACs()){
			if(ac instanceof PrimitiveAC){
				parameters = readParametersPrimitiveAC((PrimitiveAC) ac, contextModelPath, parameters);
			}else if(ac instanceof ACL){
				parameters = readParametersACL((ACL) ac, contextModelPath, parameters);
			}
		}

		return parameters;
	}
	
	public static ArrayList<Parameter> eliminateRedundantParameters(ArrayList<Parameter> parameters){
		for(int i = 0; i < parameters.size(); i++){
			Parameter p = parameters.get(i);
			for(int j = i+1; j < parameters.size(); j++){
				if(p.getName().equals(parameters.get(j).getName())){
					parameters.remove(j);
				}
			}
		}
		return parameters;
	}

}
