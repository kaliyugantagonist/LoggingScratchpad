package general;

import org.slf4j.LoggerFactory;

public class GeneralLogger {

	private final static org.slf4j.Logger slf4jLogger = LoggerFactory.getLogger(GeneralLogger.class);

	public void demonstratePlainLogger() {

		slf4jLogger.info("This is just a statement printed using slf4j. The logger instance : {} ",slf4jLogger);
	}

	public boolean demonstrateParameterizedLogging(String message, Object... args) {

		slf4jLogger.info("The logger instance: {}",slf4jLogger);
		
		if(message == null || message.isEmpty() || args == null || args.length == 0) {
			slf4jLogger.error("Null arguments aren't expected!");
			return false;
		}
		slf4jLogger.info(message, args);
		return true;
	}

}
