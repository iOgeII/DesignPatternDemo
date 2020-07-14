package example._1framework;

public class ConcreteFactoryB implements Factory {

	@Override
	public Product factoryMethod() {
		// TODO Auto-generated method stub
		return new ConcreteProductB();
	}

}
