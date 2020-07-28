package example._4BidirectionalAdapter;

public class Adapter implements Target, Adaptee {

	private Target target;
	private Adaptee adaptee;
	
	public Adapter(Target target, Adaptee adaptee) {
		// TODO Auto-generated constructor stub
		this.target = target;
		this.adaptee = adaptee;
	}
	
	public Adapter(Target target) {
		this.target = target;
	}
	
	public Adapter(Adaptee adaptee) {
		// TODO Auto-generated constructor stub
		this.adaptee = adaptee;
	}
	
	@Override
	public void specificRequest() {
		// TODO Auto-generated method stub
		target.request();
	}

	@Override
	public void request() {
		// TODO Auto-generated method stub
		adaptee.specificRequest();
	}

}
