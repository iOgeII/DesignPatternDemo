package example._1framework_AbstractFacade;

public class ConcreteFacadeA extends AbstractFacade {

	private SubSystemA subSystemA = new SubSystemA();
	private SubSystemB subSystemB = new SubSystemB();
	
	@Override
	public void method() {
		// TODO Auto-generated method stub
		subSystemA.methodA();
		subSystemB.methodB();
	}

}
