package org.kermeta.spem.activityautomation.eclipse.manualtask;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;
import org.kermeta.spem.activityautomationmanager.ActivityAutomation;

public class ManualTask implements ActivityAutomation {

	public ManualTask() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(String contextModelPath) {
		MessageDialog.openInformation(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				"Manual Tasks Performing",
				"This task must be performed manually.");

	}

}
