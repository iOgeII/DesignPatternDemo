package example._2logger_basic;

/**
 * 工厂方法模式中的ConcreteFactory
 * @author 香南鹤砚
 *
 */
public class DatabaseLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		// TODO Auto-generated method stub
		Logger logger = new DatabaseLogger();
		
		// some operation of database logger
		
		return logger;
	}

}
