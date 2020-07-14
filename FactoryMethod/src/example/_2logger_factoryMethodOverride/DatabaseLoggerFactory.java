package example._2logger_factoryMethodOverride;

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
		System.out.println("Ĭ�Ϲ��췽����");
		// some operation of database logger
		
		return logger;
	}

	@Override
	public Logger createLogger(String args) {
		// TODO Auto-generated method stub
		Logger logger = new DatabaseLogger();
		System.out.println("�ַ����������췽����");
		// some operation of database logger
		
		return logger;
	}

	@Override
	public Logger createLogger(Object obj) {
		// TODO Auto-generated method stub
		Logger logger = new DatabaseLogger();
		System.out.println("����������췽����");
		// some operation of database logger
		
		return logger;
	}

}
