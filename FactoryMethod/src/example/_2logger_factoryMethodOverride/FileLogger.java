package example._2logger_factoryMethodOverride;

/**
 * 工厂方法模式中的 ConcreteProduct
 * @author 香南鹤砚
 *
 */
public class FileLogger implements Logger {

	@Override
	public void writeLog() {
		// TODO Auto-generated method stub
		System.out.println("文件日志记录。");
	}

}
