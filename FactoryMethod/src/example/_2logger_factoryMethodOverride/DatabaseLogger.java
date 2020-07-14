package example._2logger_factoryMethodOverride;

/**
 * 工厂方法模式中的 ConcreteProduct
 * @author 香南鹤砚
 *
 */
public class DatabaseLogger implements Logger {

	@Override
	public void writeLog() {
		// TODO Auto-generated method stub
		System.out.println("数据库日志记录。");
	}

}
