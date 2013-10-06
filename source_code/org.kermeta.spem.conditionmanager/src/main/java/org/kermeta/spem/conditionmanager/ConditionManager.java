package org.kermeta.spem.conditionmanager;

public interface ConditionManager {
	
	/**
	 * 
	 * @param contextFilePath
	 * @return true if the condition evaluates positively, else returns false
	 */
	public boolean run(String contextFilePath);

}
