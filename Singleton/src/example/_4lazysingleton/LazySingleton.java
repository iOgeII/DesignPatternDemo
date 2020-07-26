package example._4lazysingleton;

public class LazySingleton {

	// private volatile static LazySingleton instance = null;
	// 3.使用双重检查+锁定时需要 使用volatile修饰符
	private volatile static LazySingleton instance = null;
	
	private LazySingleton() {}
	
	// 1.使用synchronized关键字对方法加锁，
	// →保证任意时刻只有一个线程可以执行该方法，但是性能差
//	synchronized public static LazySingleton getInstance() {
//		if(instance == null) {
//			instance = new LazySingleton();
//		}
//		return instance;
//	}
	
	// 2.使用单重检查+锁定
	//→会出现同时通过判断进入临界区
//	public static LazySingleton getInstance() {
//		if(instance == null) {
//			synchronized (LazySingleton.class) {
//				instance = new LazySingleton();
//			}
//		}
//		return instance;
//	}
	
	// 3.使用双重检查+锁定
	public static LazySingleton getInstance() {
		if(instance == null) {
			synchronized (LazySingleton.class) {
				if(instance == null) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
	
}
