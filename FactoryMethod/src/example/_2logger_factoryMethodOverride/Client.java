package example._2logger_factoryMethodOverride;

public class Client {

	// 1.Œ¥ π”√xml≈‰÷√
//	public static void main(String[] args) {
//		LoggerFactory factory;
//		Logger logger;
//		
//		
//		factory = new FileLoggerFactory();
//		logger = factory.createLogger();
//		logger.writeLog();
//		
//		factory = new DatabaseLoggerFactory();
//		logger = factory.createLogger();
//		logger.writeLog();
//	}
	
	public static void main(String[] args) {
		LoggerFactory factory;
		Logger logger;
				
		factory = (LoggerFactory)XMLUtil.getBean();
		logger = factory.createLogger(new Object());
		logger.writeLog();

	}
}
