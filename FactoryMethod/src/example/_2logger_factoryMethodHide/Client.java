package example._2logger_factoryMethodHide;

public class Client {
	
	public static void main(String[] args) {
		LoggerFactory factory;
		Logger logger;
				
		factory = (LoggerFactory)XMLUtil.getBean();
//		logger = factory.createLogger();
//		logger.writeLog();
		factory.writeLog();

	}
}
