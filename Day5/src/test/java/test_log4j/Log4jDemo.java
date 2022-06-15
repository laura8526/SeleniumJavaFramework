package test_log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class Log4jDemo {

	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World...!");


logger.trace("This is a trace message");
logger.info("This is information message");
logger.error("This is an error message");
logger.warn("This is an warning message");
logger.fatal("This is a fatal message");

System.out.println("Completed");
	}

}
