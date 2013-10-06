package org.kermeta.spem.activityautomationmanager;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.PlatformUI;

public class BehaviorExecution {

	public static void behaviorExecution(String action, String contextModelPath){
		
		Boolean oneExtensionExistsForTheAction = false;
		String nameOfTheFirstExtensionFoundForTheAction = null;
		String nameOfTheFirstPluginFoundForTheAction = null;

		//Find the class, among those extending the activityautomationregistry extension point, whose action equals action and execute its run operation
		IExtension[] extensions = Platform.getExtensionRegistry().getExtensionPoint(Activator.getDefault().PLUGIN_ID,"activityautomationregistry").getExtensions();
		for(int i = 0; i < extensions.length; i++){
			IConfigurationElement[] configElements = extensions[i].getConfigurationElements();
			for(int j = 0; j < configElements.length; j++){
				if(configElements[j].getAttribute("action").equals(action) && oneExtensionExistsForTheAction == false){
					oneExtensionExistsForTheAction = true;
					nameOfTheFirstExtensionFoundForTheAction = extensions[i].getUniqueIdentifier();
					nameOfTheFirstPluginFoundForTheAction = extensions[i].getContributor().getName();
					Object o;
					try {
						o = configElements[j].createExecutableExtension("interface");
						if (o instanceof ActivityAutomation) {
							((ActivityAutomation) o).run(contextModelPath);
						}
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else if(configElements[j].getAttribute("action").equals(action) && oneExtensionExistsForTheAction == true){
					Status status = new Status(IStatus.ERROR, Activator.getDefault().PLUGIN_ID, 0,
				            "Several plug-ins extending the activityautomationregistry extension point have the same action attribute.", null);
					ErrorDialog.openError(
							PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
							"Several implementations for the same behavior error",
							"Several implementations have been found for the same behavior. Only the first implementation found will be executed. The extension identifier of the first implementation found is "+nameOfTheFirstExtensionFoundForTheAction+" and the plug-in of this implementation is "+nameOfTheFirstPluginFoundForTheAction+". The extension identifier of the other implementation found is "+extensions[i].getUniqueIdentifier()+" and the plug-in of this implementation is "+extensions[i].getContributor().getName()+".",
							status);
				}
			}

		}

	}
}
