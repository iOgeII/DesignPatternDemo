package example._2logger_factoryMethodOverride;

/**
 * ��������ģʽ�е�Factory
 * @author ���Ϻ���
 *
 */
public interface LoggerFactory {

	public Logger createLogger();
	
	public Logger createLogger(String args);
	
	public Logger createLogger(Object obj);
}
