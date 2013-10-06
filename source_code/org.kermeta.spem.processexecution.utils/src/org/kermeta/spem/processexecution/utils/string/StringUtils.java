package org.kermeta.spem.processexecution.utils.string;

public class StringUtils {
	
	public static String convertPathIntoString(String path){
		//return path.replaceAll("\\\\", "\\\\\\\\");
		return path.replace("\\", "\\\\");
	}

}
