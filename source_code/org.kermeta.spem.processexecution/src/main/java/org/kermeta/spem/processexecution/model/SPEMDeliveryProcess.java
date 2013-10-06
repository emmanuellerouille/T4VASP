package org.kermeta.spem.processexecution.model;

import java.util.ArrayList;

import org.kermeta.spem.processexecution.model.SPEMTaskUse;

public class SPEMDeliveryProcess {
	
	private String name;
	private SPEMTaskUse[] taskUses;
	private String path;
	private String behaviorModelPath;
	
	public SPEMDeliveryProcess() {
	}

	public SPEMDeliveryProcess(String name, SPEMTaskUse[] taskUses,
			String path, String behaviorModelPath) {

		this.name = name;
		this.taskUses = taskUses;
		this.path = path;
		this.behaviorModelPath = behaviorModelPath;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SPEMTaskUse[] getTaskUses() {
		return taskUses;
	}
	public void setTaskUses(SPEMTaskUse[] taskUses) {
		this.taskUses = taskUses;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getBehaviorModelPath() {
		return behaviorModelPath;
	}
	public void setBehaviorModelPath(String behaviorModelPath) {
		this.behaviorModelPath = behaviorModelPath;
	}
}
