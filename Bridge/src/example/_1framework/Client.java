package example._1framework;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RefinedAbstraction ra = new RefinedAbstraction();
		ConcreteImplementor cImpl = new ConcreteImplementor();
		ra.setImpl(cImpl);
		ra.operation();
	}

}
