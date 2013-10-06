package org.kermeta.cvl.requirementselicitationwizard.actions;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.internal.resources.File;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.kermeta.cvl.requirementselicitationwizard.dialogs.ChoiceResolutionDialog;
import org.kermeta.cvl.resolution.ChoiceResolution;
import org.kermeta.cvl.resolution.ResolutionFactory;
import org.kermeta.cvl.resolution.ResolutionPackage;
import org.kermeta.cvl.resolution.VPackageResolution;
import org.kermeta.cvl.variability.Choice;
import org.kermeta.cvl.variability.VPackage;
import org.kermeta.cvl.variability.VPackageable;
import org.kermeta.cvl.variability.VSpec;
import org.kermeta.cvl.variability.VariabilityPackage;

public class ResolveVariability implements IObjectActionDelegate{
	
	private ResolutionFactory factory;
	private VPackageResolution vPackageResolution;
	private IWorkbenchPart targetPart;
	private ISelection selection;
	private File cvlModel;
	private HashMap<Choice, Boolean> choices;
	private VPackage vPackage;

	public ResolveVariability() {
		
	}

	@Override
	public void run(IAction action) {
		if (selection instanceof StructuredSelection){
			StructuredSelection structuredSelection = (StructuredSelection) selection;
			if(structuredSelection.getFirstElement() instanceof File){
				cvlModel = (File) structuredSelection.getFirstElement();
			}
		}
		
		// Initialize the model
		VariabilityPackage.eINSTANCE.eClass();
		
		// Register the XMI resource factory for the .website extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("variability", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI
				.createURI("platform:/resource"+cvlModel.getFullPath()), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		vPackage = (VPackage) resource.getContents().get(0);
		
		// Initialize the model
		ResolutionPackage.eINSTANCE.eClass();
		// Retrieve the default factory singleton
		factory = ResolutionFactory.eINSTANCE;

		// Create the content of the model via this program
		vPackageResolution = factory.createVPackageResolution();
		
		resolveCVLVSpecModel(vPackage, vPackageResolution);

		// As of here we preparing to save the model content

		// Register the XMI resource factory for the .website extension

		//Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		//Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("resolution", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		//ResourceSet resSet = new ResourceSetImpl();

		// Create a resource
		Resource resource2 = resSet.createResource(URI
				.createURI("platform:/resource"+cvlModel.getFullPath().removeFileExtension()+".resolution"));
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		resource2.getContents().add(vPackageResolution);

		// Now save the content.
		try {
			resource2.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
		
	}
	
	public void resolveCVLVSpecModel(VPackage vPackage, VPackageResolution vPackageResolution){
		for(VPackageable vSpec : vPackage.getPackageElement()){
			if(vSpec instanceof Choice){
				Choice choice = (Choice) vSpec;
				ChoiceResolution choiceResolution = factory.createChoiceResolution();
				choiceResolution.setName(choice.getName());
				choiceResolution.setResolvedChoice(choice);
				choiceResolution.setResolvedVSpec(choice);
				if(choice.isDefaultResolution()){
					choiceResolution.setDecision(true);
				}else{
					choiceResolution.setDecision(false);
				}
				if(!choice.getChildVSpec().isEmpty()){
					for(VSpec childVSpec : choice.getChildVSpec()){
						if(childVSpec instanceof Choice){
							Choice childChoice = (Choice) childVSpec;
							ChoiceResolution childChoiceResolution = factory.createChoiceResolution();
							childChoiceResolution.setName(childChoice.getName());
							childChoiceResolution.setResolvedChoice(childChoice);
							childChoiceResolution.setResolvedVSpec(childChoice);
							childChoiceResolution.setDecision(false);
							choiceResolution.getChildResolution().add(childChoiceResolution);
						}
					}
				}
				vPackageResolution.getPackagedElements().add(choiceResolution);
			}
		}
		resolveChoice(vPackage, vPackageResolution);
	}
	
	public void resolveChoice(VPackage vPackage, VPackageResolution vPackageResolution){
		ChoiceResolutionDialog choiceResolutionDialog = new ChoiceResolutionDialog(targetPart.getSite().getShell(), vPackage, vPackageResolution);
		choiceResolutionDialog.create();
		choiceResolutionDialog.open();
		vPackageResolution = choiceResolutionDialog.getVPackageResolution();
	}
}
