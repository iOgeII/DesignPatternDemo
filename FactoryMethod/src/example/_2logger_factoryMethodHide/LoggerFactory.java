package example._2logger_factoryMethodHide;

/**
 * ��������ģʽ�е�Factory
 * @author ���Ϻ���
 *
 */
public abstract class LoggerFactory {

	public abstract Logger createLogger();
	
	public void writeLog() {
		Logger logger = this.createLogger();
		logger.writeLog();
	}
}
