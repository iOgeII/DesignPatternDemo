package example._2logger_factoryMethodHide;

/**
 * ��������ģʽ�е�ConcreteFactory
 * @author ���Ϻ���
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
