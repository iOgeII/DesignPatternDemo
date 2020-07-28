package example._3DefaultAdapter;

public class ConcreteServiceClassX extends AbstractServiceClass {

	@Override
	public void serviceMethodA() {
		System.out.println("X completes service method A.");
	}
	
	@Override
	public void serviceMethodC() {
		System.out.println("X completes service method C.");
	}
}
