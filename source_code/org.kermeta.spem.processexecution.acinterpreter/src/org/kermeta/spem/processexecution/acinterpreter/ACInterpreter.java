package org.kermeta.spem.processexecution.acinterpreter;

import org.kermeta.spem.activityautomationmanager.BehaviorExecution;
import org.kermeta.spem.behavior.AC;
import org.kermeta.spem.behavior.ACL;
import org.kermeta.spem.behavior.Container;
import org.kermeta.spem.behavior.JavaEclipseAction;
import org.kermeta.spem.behavior.PrimitiveAC;
import org.kermeta.spem.behavior.WorkUnitHandle;
import org.kermeta.spem.executioncontext.ExecutionContext;
import org.kermeta.spem.executioncontext.OnWhat;
import org.kermeta.spem.processexecution.utils.model.ModelUtils;

import spem.ProcessPackageableElement;
import spem.TaskUse;

public class ACInterpreter {

	public static void initialize(String taskUseName, String behaviorModelPath, String contextModelPath){

		Container container = ModelUtils.getBehaviorModelRoot(behaviorModelPath);
		for(WorkUnitHandle wuh : container.getWorkUnitHandles()){
			if(wuh.getWorkUnit() instanceof ProcessPackageableElement){
				ProcessPackageableElement t = (ProcessPackageableElement) wuh.getWorkUnit();
				if(t.getName().equals(taskUseName)){
					ExecutionContext executionContext = ModelUtils.getExecutionContextRoot(contextModelPath);
					ModelUtils.changeWorkUnitUnderExecution(executionContext, wuh.getName());
					ModelUtils.changeOnWhatUnderExecution(executionContext, OnWhat.ON_START);
					if(wuh.getOnStart() instanceof PrimitiveAC){
						executePrimitiveAC((PrimitiveAC) wuh.getOnStart(), contextModelPath, executionContext);
					}else if(wuh.getOnStart() instanceof ACL){
						executeACL((ACL) wuh.getOnStart(), contextModelPath, executionContext);
					}
				}
			}
		}
	}

	public static void execute(String taskUseName, String behaviorModelPath, String contextModelPath){

		Container container = ModelUtils.getBehaviorModelRoot(behaviorModelPath);
		for(WorkUnitHandle wuh : container.getWorkUnitHandles()){
			if(wuh.getWorkUnit() instanceof ProcessPackageableElement){
				ProcessPackageableElement t = (ProcessPackageableElement) wuh.getWorkUnit();
				if(t.getName().equals(taskUseName)){
					ExecutionContext executionContext = ModelUtils.getExecutionContextRoot(contextModelPath);
					ModelUtils.changeWorkUnitUnderExecution(executionContext, wuh.getName());
					ModelUtils.changeOnWhatUnderExecution(executionContext, OnWhat.ON_DO);
					if(wuh.getOnDo() instanceof PrimitiveAC){
						executePrimitiveAC((PrimitiveAC) wuh.getOnDo(), contextModelPath, executionContext);
					}else if(wuh.getOnDo() instanceof ACL){
						executeACL((ACL) wuh.getOnDo(), contextModelPath, executionContext);
					}
				}
			}
		}
	}

	public static void finalize(String taskUseName, String behaviorModelPath, String contextModelPath){

		Container container = ModelUtils.getBehaviorModelRoot(behaviorModelPath);
		for(WorkUnitHandle wuh : container.getWorkUnitHandles()){
			if(wuh.getWorkUnit() instanceof ProcessPackageableElement){
				ProcessPackageableElement t = (ProcessPackageableElement) wuh.getWorkUnit();
				if(t.getName().equals(taskUseName)){
					ExecutionContext executionContext = ModelUtils.getExecutionContextRoot(contextModelPath);
					ModelUtils.changeWorkUnitUnderExecution(executionContext, wuh.getName());
					ModelUtils.changeOnWhatUnderExecution(executionContext, OnWhat.ON_END);
					if(wuh.getOnEnd() instanceof PrimitiveAC){
						executePrimitiveAC((PrimitiveAC) wuh.getOnEnd(), contextModelPath, executionContext);
					}else if(wuh.getOnEnd() instanceof ACL){
						executeACL((ACL) wuh.getOnEnd(), contextModelPath, executionContext);
					}
				}
			}
		}
	}

	public static void executePrimitiveAC(PrimitiveAC primitiveAC, String contextModelPath, ExecutionContext executionContext){
		if(primitiveAC.getAction() instanceof JavaEclipseAction){
			ModelUtils.changePrimitiveACNameUnderExecution(executionContext, primitiveAC.getName());
			executeJavaEclipseAction((JavaEclipseAction) primitiveAC.getAction(), contextModelPath);
		}
	}

	public static void executeACL(ACL acl, String contextModelPath, ExecutionContext executionContext){
		for(AC ac : acl.getACs()){
			if(ac instanceof PrimitiveAC){
				executePrimitiveAC((PrimitiveAC) ac, contextModelPath, executionContext);
				if(((PrimitiveAC) ac).getAction().getExpression().equals("restart")){
					break;
				}
			}else if(ac instanceof ACL){
				executeACL((ACL) ac, contextModelPath, executionContext);
			}
		}
	}

	public static void executeJavaEclipseAction(JavaEclipseAction javaEclipseAction, String contextModelPath){
		BehaviorExecution.behaviorExecution(javaEclipseAction.getExpression(), contextModelPath);
	}

}
