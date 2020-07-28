package example._3DefaultAdapter;

public class Client {

	public static void main(String[] args) {
		ConcreteServiceClassX sx = new ConcreteServiceClassX();
		System.out.println("Method A:");
		sx.serviceMethodA();
		System.out.println("Method B:");
		sx.serviceMethodB();
		System.out.println("Method C:");
		sx.serviceMethodC();
	}
}
