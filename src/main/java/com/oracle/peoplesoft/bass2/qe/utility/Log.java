package com.oracle.peoplesoft.bass2.qe.utility;

import org.apache.log4j.Logger;

public class Log {
	
	//Initialize Log4j logs
	
	private static Logger log=Logger.getLogger(Log.class.getName());
	
	//This is to print log for the begining of the test case, as we usually run so many test cases as a test suite
	
		public static void startTestCase(String sTestCaseName) {	
			Log.info("****************************************************************************************");
		    Log.info("****************************************************************************************");
		    Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
		    Log.info("****************************************************************************************");
		    Log.info("****************************************************************************************");
			
		}
		
		public static void endTestCase(String sTestCaseName) {
			Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+sTestCaseName+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
		    Log.info("X");
		    Log.info("X");
		    Log.info("X");
		    Log.info("X");
		}
		
		 // Need to create these methods, so that they can be called  
		public static void info(String message) {
		        Log.info(message);
		        }
		public static void warn(String message) {
		    Log.warn(message);
		    }
		public static void error(String message) {
		    Log.error(message);
		    }
		public static void fatal(String message) {
		    Log.fatal(message);
		    }
		public static void debug(String message) {
		    Log.debug(message);
		    }


}
