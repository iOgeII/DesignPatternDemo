package example._1framework;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory;
		Product product;
		
		//ps:����Ĺ������Ժ����xml+����ע��
		factory = new ConcreteFactoryA();
		product = factory.factoryMethod();
		product.methodSame();
		product.methodDiff();
		
		//ps:����Ĺ������Ժ����xml+����ע��
		factory = new ConcreteFactoryB();
		product = factory.factoryMethod();
		product.methodSame();
		product.methodDiff();
	}

}
