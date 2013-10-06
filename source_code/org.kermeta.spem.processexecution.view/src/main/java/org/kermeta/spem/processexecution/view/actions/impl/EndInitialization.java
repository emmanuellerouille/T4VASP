package org.kermeta.spem.processexecution.view.actions.impl;

import org.eclipse.draw2d.Label;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.kermeta.spem.executioncontext.State;
import org.kermeta.spem.processexecution.utils.model.ModelUtils;
import org.kermeta.spem.processexecution.view.HyperlinkFigure;
import org.kermeta.spem.processexecution.view.ProcessPart;
import org.kermeta.spem.processexecution.view.TaskFigure;
import org.kermeta.spem.processexecution.view.actions.ProcessAction;

import spem.Activity;

public class EndInitialization extends ProcessAction {

	public EndInitialization(boolean enabled, String taskUseName,
			String contextModelPath, Activity containingActivity) {
		super(enabled, taskUseName, contextModelPath, containingActivity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		//update process view
		ProcessPart view;
		try {
			view = (ProcessPart)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("ProcessExecution.views.ProcessElementsView");
			for(TaskFigure taskFigure : view.getMediator().getView().getTaskFigures()){
				if(taskFigure.getDescription().equals(taskUseName)){
					for( int i = 0; i < taskFigure.getStdActionsPlate().getChildren().size(); i++){
						Label label = (Label) taskFigure.getStdActionsPlate().getChildren().get(i);
						if(label instanceof HyperlinkFigure){
							HyperlinkFigure hyperlinkFigure = (HyperlinkFigure) label;

							if(hyperlinkFigure.getText() == "end initialization"){
								hyperlinkFigure.getAction().setEnabled(false);
							}
							if(hyperlinkFigure.getText() == "on do"){
								hyperlinkFigure.getAction().setEnabled(true);
							}
							hyperlinkFigure.repaint();
						}
					}
					ModelUtils.changeStateWorkUnitIntoExecutionContextModel(ModelUtils.getExecutionContextRoot(contextModelPath), taskUseName, State.ON_DO);
				}
			}
		} catch (PartInitException e) {
			e.printStackTrace();
		}

		//Compute and save the time to execute the on start
		String beginning = ModelUtils.getValueOfKey("begining date "+taskUseName+" on start", ModelUtils.getExecutionContextRoot(contextModelPath));
		Long beginningDate = Long.valueOf(beginning);
		Utils.computeTime(beginningDate, contextModelPath, taskUseName, "on start");
		ModelUtils.removeKeyValueFromExecutionContextModel(ModelUtils.getExecutionContextRoot(contextModelPath), "begining date "+taskUseName+" on start");

	}

}
