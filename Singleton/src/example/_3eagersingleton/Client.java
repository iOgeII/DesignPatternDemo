package example._3eagersingleton;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EagerSingleton s1 = EagerSingleton.getInstance();
		EagerSingleton s2 = EagerSingleton.getInstance();
		System.out.println("�Ƿ�Ϊͬһʵ����"+(s1==s2));
	}

}
