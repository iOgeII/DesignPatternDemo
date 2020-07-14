package example._2logger_factoryMethodOverride;

/**
 * 工厂方法模式中的ConcreteFactory
 * @author 香南鹤砚
 *
 */
public class FileLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		// TODO Auto-generated method stub
		Logger logger = new FileLogger();
		System.out.println("默认构造方法。");
		// some operation of file logger
		
		return logger;
	}

	@Override
	public Logger createLogger(String args) {
		// TODO Auto-generated method stub
		Logger logger = new FileLogger();
		System.out.println("字符串参数构造方法。");
		// some operation of file logger
		
		return logger;
	}

	@Override
	public Logger createLogger(Object obj) {
		// TODO Auto-generated method stub
		Logger logger = new FileLogger();
		System.out.println("对象参数构造方法。");
		// some operation of file logger
		
		return logger;
	}

}
