package example._3eagersingleton;

public class EagerSingleton {

	// (static final 关键字)在类加载时就创建单例对象
	private static final EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
}
