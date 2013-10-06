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

public class EndFinalization extends ProcessAction {

	public EndFinalization(boolean enabled, String taskUseName,
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

							//In any cases, put end finalization to false
							taskFigure.setFinished(true);
							if(hyperlinkFigure.getText() == "end finalization"){
								hyperlinkFigure.getAction().setEnabled(false);
							}

							//Set skip to false if it was enabled
							if(hyperlinkFigure.getText() == "skip" && hyperlinkFigure.getAction().isEnabled()){
								hyperlinkFigure.getAction().setEnabled(false);
							}
							hyperlinkFigure.repaint();
						}
					}
					//Set the status of the following work units and change the state to finished
					Utils.setStatusFollowingWorkUnits(taskFigure.getDescription(), view, ModelUtils.getProcessModelPath(contextModelPath), ModelUtils.getExecutionContextRoot(contextModelPath), this.getContainingActivity());
					ModelUtils.changeStateWorkUnitIntoExecutionContextModel(ModelUtils.getExecutionContextRoot(contextModelPath), taskUseName, State.FINISHED);
				}
			}
		} catch (PartInitException e) {
			e.printStackTrace();
		}

		//Compute and save the time to execute the on end
		String beginning = ModelUtils.getValueOfKey("begining date "+taskUseName+" on end", ModelUtils.getExecutionContextRoot(contextModelPath));
		Long beginningDate = Long.valueOf(beginning);
		Utils.computeTime(beginningDate, contextModelPath, taskUseName, "on end");
		ModelUtils.removeKeyValueFromExecutionContextModel(ModelUtils.getExecutionContextRoot(contextModelPath), "begining date "+taskUseName+" on end");

	}

}
