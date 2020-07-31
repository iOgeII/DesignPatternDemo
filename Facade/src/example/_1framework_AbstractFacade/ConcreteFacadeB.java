package example._1framework_AbstractFacade;

public class ConcreteFacadeB extends AbstractFacade {

	private SubSystemB subSystemB = new SubSystemB();
	private SubSystemC subSystemC = new SubSystemC();
	
	@Override
	public void method() {
		// TODO Auto-generated method stub
		subSystemB.methodB();
		subSystemC.methodC();
	}

}
