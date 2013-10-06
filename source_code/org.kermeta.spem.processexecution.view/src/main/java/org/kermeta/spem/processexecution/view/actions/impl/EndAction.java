package org.kermeta.spem.processexecution.view.actions.impl;

import java.util.Date;

import org.eclipse.draw2d.Label;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.kermeta.spem.behavior.AC;
import org.kermeta.spem.executioncontext.ExecutionContext;
import org.kermeta.spem.executioncontext.State;
import org.kermeta.spem.parameterreader.ParameterReader;
import org.kermeta.spem.processexecution.acinterpreter.ACInterpreter;
import org.kermeta.spem.processexecution.utils.model.ModelUtils;
import org.kermeta.spem.processexecution.view.HyperlinkFigure;
import org.kermeta.spem.processexecution.view.ProcessPart;
import org.kermeta.spem.processexecution.view.TaskFigure;
import org.kermeta.spem.processexecution.view.actions.ProcessAction;

import spem.Activity;


public class EndAction extends ProcessAction {

	public EndAction(boolean enabled, String taskUseName, String contextModelPath, Activity containingActivity){
		super(enabled, taskUseName, contextModelPath, containingActivity);
	}

	@Override
	public void run() {

		Date beginning = new Date();

		//Save the beginning date into the context model in case of a restart
		ModelUtils.setValueOfKeyIntoExecutionContextModel(ModelUtils.getExecutionContextRoot(contextModelPath), "time before restart", ((Long)beginning.getTime()).toString());

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

							//The task is finished if the finalization is automated
							if(!ModelUtils.isFinalizationManual(taskUseName)){
								taskFigure.setFinished(true);
							}
							
							//In any cases, put on end to false
							if(hyperlinkFigure.getText() == "on end"){
								hyperlinkFigure.getAction().setEnabled(false);
							}
							
							//Set end finalization to true if the finalization is manual
							if(hyperlinkFigure.getText() == "end finalization" && ModelUtils.isFinalizationManual(taskUseName)){
								hyperlinkFigure.getAction().setEnabled(true);
								ModelUtils.changeStateWorkUnitIntoExecutionContextModel(ModelUtils.getExecutionContextRoot(contextModelPath), taskUseName, State.END_FINALIZATION);
							}

							//Set skip to false if it was enabled and if the finalization is automated
							if(hyperlinkFigure.getText() == "skip" && hyperlinkFigure.getAction().isEnabled() && !ModelUtils.isFinalizationManual(taskUseName)){
								hyperlinkFigure.getAction().setEnabled(false);
							}
							hyperlinkFigure.repaint();
						}
					}
					//Set the status of the following work units and change the state to finished if the finalization is automated
					if(!ModelUtils.isFinalizationManual(taskUseName)){
						Utils.setStatusFollowingWorkUnits(taskFigure.getDescription(), view, ModelUtils.getProcessModelPath(contextModelPath), ModelUtils.getExecutionContextRoot(contextModelPath), this.getContainingActivity());
						ModelUtils.changeStateWorkUnitIntoExecutionContextModel(ModelUtils.getExecutionContextRoot(contextModelPath), taskUseName, State.FINISHED);
					}
				}
			}
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//If the finalization is automated, then launch the automatisation and compute the time to execute
		if(ModelUtils.isFinalizationAutomated(taskUseName)){
			//Ask for needed parameters
			AC ac = ModelUtils.findACForWorkUnit(taskUseName, ModelUtils.getBehaviorModelPath(contextModelPath), "onEnd");
			ParameterReader.readParameters(ac, contextModelPath);

			//Execute the task
			ACInterpreter.finalize(taskUseName, ModelUtils.getBehaviorModelPath(contextModelPath), contextModelPath);

			if(!PlatformUI.getWorkbench().getPreferenceStore().getBoolean("before restart")){
				//Compute the time to execute the on end
				Utils.computeTime(beginning.getTime(), contextModelPath, taskUseName, "on end");
			}
		}else if (ModelUtils.isFinalizationManual(taskUseName)){//if the finalization is manual, then save the beginning date into the context model
			ModelUtils.addKeyValueIntoExecutionContextModel(ModelUtils.getExecutionContextRoot(contextModelPath), "begining date "+taskUseName+" on end", ((Long)beginning.getTime()).toString());
		}
	}
}
