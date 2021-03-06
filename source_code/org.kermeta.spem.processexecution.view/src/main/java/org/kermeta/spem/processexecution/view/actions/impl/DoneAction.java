package org.kermeta.spem.processexecution.view.actions.impl;

import java.util.Date;

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

public class DoneAction extends ProcessAction {

	public DoneAction(boolean enabled, String taskUseName, String contextModelPath, Activity containingActivity){
		super(enabled, taskUseName, contextModelPath, containingActivity);
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

							if(!ModelUtils.isFinalizationAutomated(taskFigure.getDescription())){
								//If the finalization is manual, then enable on end
								if(ModelUtils.isFinalizationManual(taskUseName)){
									if(hyperlinkFigure.getText() == "on end"){
										hyperlinkFigure.getAction().setEnabled(true);
									}
								}
								//If the finalization is not automated and is not manual, then set skip to false if it was enabled
								else if(hyperlinkFigure.getText() == "skip" && hyperlinkFigure.getAction().isEnabled()){
									hyperlinkFigure.getAction().setEnabled(false);
								}
							}else{//the finalization is automated, put on end to true
								if(hyperlinkFigure.getText() == "on end"){
									hyperlinkFigure.getAction().setEnabled(true);
									ModelUtils.changeStateWorkUnitIntoExecutionContextModel(ModelUtils.getExecutionContextRoot(contextModelPath), taskUseName, State.ON_END);
								}
							}

							//In any cases, put done to false
							if(hyperlinkFigure.getText() == "done"){
								hyperlinkFigure.getAction().setEnabled(false);
							}
							hyperlinkFigure.repaint();
						}
					}
					//If the finalization is not automated and is not manual, then finish the current task figure and put the on start or on do of the following tasks to true
					if(!ModelUtils.isFinalizationAutomated(taskFigure.getDescription()) && !ModelUtils.isFinalizationManual(taskUseName)){
						taskFigure.setFinished(true);
						ModelUtils.changeStateWorkUnitIntoExecutionContextModel(ModelUtils.getExecutionContextRoot(contextModelPath), taskUseName, State.FINISHED);
						//Set the status of the following work units
						Utils.setStatusFollowingWorkUnits(taskFigure.getDescription(), view, ModelUtils.getProcessModelPath(contextModelPath), ModelUtils.getExecutionContextRoot(contextModelPath), this.getContainingActivity());
					}
					
					//If the finalization is manual, then just change the state of the work unit under execution
					else if(!ModelUtils.isFinalizationAutomated(taskFigure.getDescription()) && ModelUtils.isFinalizationManual(taskUseName)){
						ModelUtils.changeStateWorkUnitIntoExecutionContextModel(ModelUtils.getExecutionContextRoot(contextModelPath), taskUseName, State.ON_END);
					}
				}
			}
		} catch (PartInitException e) {
			e.printStackTrace();
		}

		//Compute and save the time to execute the on do
		String beginning = ModelUtils.getValueOfKey("begining date "+taskUseName+" on do", ModelUtils.getExecutionContextRoot(contextModelPath));
		Long beginningDate = Long.valueOf(beginning);
		Utils.computeTime(beginningDate, contextModelPath, taskUseName, "on do");
		ModelUtils.removeKeyValueFromExecutionContextModel(ModelUtils.getExecutionContextRoot(contextModelPath), "begining date "+taskUseName+" on do");
	}
}
