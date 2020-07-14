package example._2logger_basic;

/**
 * ��������ģʽ�е�ConcreteFactory
 * @author ���Ϻ���
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
