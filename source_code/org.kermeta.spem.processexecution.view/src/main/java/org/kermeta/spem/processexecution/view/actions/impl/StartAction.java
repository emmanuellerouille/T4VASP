package org.kermeta.spem.processexecution.view.actions.impl;

import java.util.Date;

import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
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
import org.kermeta.spem.processexecution.view.actions.ProcessAction;
import org.kermeta.spem.processexecution.view.TaskFigure;

import spem.Activity;


public class StartAction extends ProcessAction {

	public StartAction(boolean enabled, String taskUseName, String contextModelPath, Activity containingActivity){
		super(enabled, taskUseName, contextModelPath, containingActivity);
	}

	@Override
	public void run() {
		
		//Set the name of the work unit under execution
		ModelUtils.setWorkUnitNameUnderExecution(ModelUtils.getExecutionContextRoot(contextModelPath), taskUseName);
		
		//Get the beginning date
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
							//In any cases the on start is disabled
							if(hyperlinkFigure.getText() == "on start"){
								hyperlinkFigure.getAction().setEnabled(false);
							}
							//If the initialization is manual then the end initialization must be enabled
							if(hyperlinkFigure.getText() == "end initialization" && ModelUtils.isInitializationManual(taskUseName)){
								hyperlinkFigure.getAction().setEnabled(true);
								ModelUtils.changeStateWorkUnitIntoExecutionContextModel(ModelUtils.getExecutionContextRoot(contextModelPath), taskUseName, State.END_INITIALIZATION);
							}
							//If the initialization is not manual then the on do must be enabled
							if(hyperlinkFigure.getText() == "on do" && !ModelUtils.isInitializationManual(taskUseName)){
								hyperlinkFigure.getAction().setEnabled(true);
								ModelUtils.changeStateWorkUnitIntoExecutionContextModel(ModelUtils.getExecutionContextRoot(contextModelPath), taskUseName, State.ON_DO);
							}
							hyperlinkFigure.repaint();
						}
					}
				}
			}
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//If the initialization is automated, then launch the automatisation and compute the time to execute
		if(!ModelUtils.isInitializationManual(taskUseName)){
			//Ask for needed parameters
			AC ac = ModelUtils.findACForWorkUnit(taskUseName, ModelUtils.getBehaviorModelPath(contextModelPath), "onStart");
			ParameterReader.readParameters(ac, contextModelPath);

			//Execute the task
			ACInterpreter.initialize(taskUseName, ModelUtils.getBehaviorModelPath(contextModelPath), contextModelPath);

			if(!PlatformUI.getWorkbench().getPreferenceStore().getBoolean("before restart")){
				//Compute the time to execute the on start
				Utils.computeTime(beginning.getTime(), contextModelPath, taskUseName, "on start");
			}
		}else {//if the initialization is manual, then save the beginning date into the context model
			ModelUtils.addKeyValueIntoExecutionContextModel(ModelUtils.getExecutionContextRoot(contextModelPath), "begining date "+taskUseName+" on start", ((Long)beginning.getTime()).toString());
		}
	}
}
