package example._1framework;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcreteComponent cc = new ConcreteComponent();
		ConcreteDecorator cd = new ConcreteDecorator(cc);
		//cd.operation();
		
		ConcreteDecorator cd2 = new ConcreteDecorator(cd);
		cd2.operation();
	}

}
