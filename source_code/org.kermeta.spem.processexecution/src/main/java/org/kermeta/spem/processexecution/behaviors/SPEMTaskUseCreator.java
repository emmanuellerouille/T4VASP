package org.kermeta.spem.processexecution.behaviors;

import java.util.ArrayList;

import org.kermeta.spem.processexecution.model.SPEMTaskUse;

import org.kermeta.spem.processexecution.behaviors.SPEMTaskUseCreator;


public class SPEMTaskUseCreator {
	
	private static ArrayList<SPEMTaskUse> spemTaskUses = new ArrayList<SPEMTaskUse>();

	public static ArrayList<SPEMTaskUse> getSpemTaskUses() {
		return spemTaskUses;
	}

	public static void setSpemTaskUses(ArrayList<SPEMTaskUse> spemTaskUses) {
		SPEMTaskUseCreator.spemTaskUses = spemTaskUses;
	}
	
	public static void addTaskUse(){
//		SPEMTaskUse taskUse1 = new SPEMTaskUse("Metamodel creation");
//		spemTaskUses.add(taskUse1);
//		SPEMTaskUse taskUse2 = new SPEMTaskUse("Tree concrete syntax creation");
//		spemTaskUses.add(taskUse2);
		//spemTaskUses.add(new SPEMTaskUse(taskUseName));
	}

}
