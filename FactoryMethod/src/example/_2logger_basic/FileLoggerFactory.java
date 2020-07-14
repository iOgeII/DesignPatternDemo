package example._2logger_basic;

/**
 * ��������ģʽ�е�ConcreteFactory
 * @author ���Ϻ���
 *
 */
public class FileLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		// TODO Auto-generated method stub
		Logger logger = new FileLogger();
		
		// some operation of file logger
		
		return logger;
	}

}
