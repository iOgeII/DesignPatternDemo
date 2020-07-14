package example._2logger_factoryMethodHide;

/**
 * 工厂方法模式中的ConcreteFactory
 * @author 香南鹤砚
 *
 */
public class DatabaseLoggerFactory extends LoggerFactory {

	public Logger createLogger() {
		// TODO Auto-generated method stub
		Logger logger = new DatabaseLogger();
		
		// some operation of database logger
		
		return logger;
	}

}
