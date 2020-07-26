package example._4lazysingleton;

public class LazySingleton {

	// private volatile static LazySingleton instance = null;
	// 3.ʹ��˫�ؼ��+����ʱ��Ҫ ʹ��volatile���η�
	private volatile static LazySingleton instance = null;
	
	private LazySingleton() {}
	
	// 1.ʹ��synchronized�ؼ��ֶԷ���������
	// ����֤����ʱ��ֻ��һ���߳̿���ִ�и÷������������ܲ�
//	synchronized public static LazySingleton getInstance() {
//		if(instance == null) {
//			instance = new LazySingleton();
//		}
//		return instance;
//	}
	
	// 2.ʹ�õ��ؼ��+����
	//�������ͬʱͨ���жϽ����ٽ���
//	public static LazySingleton getInstance() {
//		if(instance == null) {
//			synchronized (LazySingleton.class) {
//				instance = new LazySingleton();
//			}
//		}
//		return instance;
//	}
	
	// 3.ʹ��˫�ؼ��+����
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
