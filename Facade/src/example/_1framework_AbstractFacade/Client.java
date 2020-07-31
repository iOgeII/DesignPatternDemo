package example._1framework_AbstractFacade;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFacade f1 = new ConcreteFacadeA();
		f1.method();
		System.out.println("-------------------");
		AbstractFacade f2 = new ConcreteFacadeB();
		f2.method();
	}

}
