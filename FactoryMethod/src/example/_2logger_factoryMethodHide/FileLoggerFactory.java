package example._2logger_factoryMethodHide;

/**
 * ��������ģʽ�е�ConcreteFactory
 * @author ���Ϻ���
 *
 */
public class FileLoggerFactory extends LoggerFactory{

	public Logger createLogger() {
		// TODO Auto-generated method stub
		Logger logger = new FileLogger();
		
		// some operation of file logger
		
		return logger;
	}

}
