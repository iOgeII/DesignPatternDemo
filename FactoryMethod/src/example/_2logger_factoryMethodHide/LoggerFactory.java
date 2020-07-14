package example._2logger_factoryMethodHide;

/**
 * 工厂方法模式中的Factory
 * @author 香南鹤砚
 *
 */
public abstract class LoggerFactory {

	public abstract Logger createLogger();
	
	public void writeLog() {
		Logger logger = this.createLogger();
		logger.writeLog();
	}
}
