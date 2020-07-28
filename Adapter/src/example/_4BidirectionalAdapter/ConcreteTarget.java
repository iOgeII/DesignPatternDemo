package example._4BidirectionalAdapter;

public class ConcreteTarget implements Target {

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("[from Adaptee] connecting Concrete Target...");
	}

}
