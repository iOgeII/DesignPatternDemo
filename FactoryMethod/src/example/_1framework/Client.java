package example._1framework;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory;
		Product product;
		
		//ps:具体的工厂类稍后改用xml+反射注入
		factory = new ConcreteFactoryA();
		product = factory.factoryMethod();
		product.methodSame();
		product.methodDiff();
		
		//ps:具体的工厂类稍后改用xml+反射注入
		factory = new ConcreteFactoryB();
		product = factory.factoryMethod();
		product.methodSame();
		product.methodDiff();
	}

}
