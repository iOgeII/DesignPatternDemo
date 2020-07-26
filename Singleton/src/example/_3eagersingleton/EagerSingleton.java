package example._3eagersingleton;

public class EagerSingleton {

	// (static final �ؼ���)�������ʱ�ʹ�����������
	private static final EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
}
