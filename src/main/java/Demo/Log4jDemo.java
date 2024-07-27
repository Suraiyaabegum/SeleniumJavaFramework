package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	private static Logger logger=LogManager.getLogger(Log4jDemo.class); // The class name is mentioned coz it will create logger for that particular class

	public static void main(String[] args) {
		
         System.out.println("\n Hello World....! \n");
         
         logger.info("This is information message");
         logger.error("This is error message");
         logger.warn("This is warn message");
         logger.fatal("This is fatal message");
         
         System.out.println("\n Completed \n");
	}

}
