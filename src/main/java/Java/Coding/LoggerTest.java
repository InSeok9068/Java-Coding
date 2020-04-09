package Java.Coding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {
	
	private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class); 

	public static void main(String[] args) {
		System.out.println("테스트");
		logger.debug("DEBUG");
		logger.error("ERROR");
		logger.warn("WARN");
		logger.info("INFO");
	}
}
