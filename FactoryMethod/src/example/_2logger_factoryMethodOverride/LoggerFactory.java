package example._2logger_factoryMethodOverride;

/**
 * 工厂方法模式中的Factory
 * @author 香南鹤砚
 *
 */
public interface LoggerFactory {

	public Logger createLogger();
	
	public Logger createLogger(String args);
	
	public Logger createLogger(Object obj);
}
