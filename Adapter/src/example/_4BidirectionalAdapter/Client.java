package example._4BidirectionalAdapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteTarget ct = new ConcreteTarget();
		ConcreteAdaptee ca = new ConcreteAdaptee();
		Adapter adapter = new Adapter(ct, ca);
		
		adapter.request();
		adapter.specificRequest();
	}

}
