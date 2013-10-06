package org.kermeta.spem.processexecution.view.actions;

import spem.Activity;

public abstract class ProcessAction {

	protected boolean enabled;
	protected String taskUseName;
	protected String contextModelPath;
	protected Activity containingActivity;
	
	public ProcessAction(boolean enabled, String taskUseName, String contextModelPath, Activity containingActivity){
		this.enabled = enabled;
		this.taskUseName = taskUseName;
		this.contextModelPath = contextModelPath;
		this.containingActivity = containingActivity;
	}

	public boolean isEnabled(){
		return enabled;
	}

	public abstract void run();

	public void setEnabled(boolean enabled){
		this.enabled = enabled;
	}

	public String getTaskUseName() {
		return taskUseName;
	}

	public void setTaskUseName(String taskUseName) {
		this.taskUseName = taskUseName;
	}

	public String getContextModelPath() {
		return contextModelPath;
	}

	public void setContextModelPath(String contextModelPath) {
		this.contextModelPath = contextModelPath;
	}

	public Activity getContainingActivity() {
		return containingActivity;
	}

	public void setContainingActivity(Activity containingActivity) {
		this.containingActivity = containingActivity;
	}
}
