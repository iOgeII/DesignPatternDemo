package example._1framework;

public class Client {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println("是否为同一实例："+(s1==s2));
	}
}
