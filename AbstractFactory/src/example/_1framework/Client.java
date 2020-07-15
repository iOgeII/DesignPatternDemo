package example._1framework;

public class Client {

	public static void main(String[] args) {
		AbstractFactory factory;
		AbstractProductA pa;
		AbstractProductB pb;
		
		factory = new ConcreteFactory2();
		pa = factory.createProductA();
		pb = factory.createProductB();
		pa.productInfo();
		pb.productInfo();
	}
}
