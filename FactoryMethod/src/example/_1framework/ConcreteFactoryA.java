package example._1framework;

public class ConcreteFactoryA implements Factory {

	@Override
	public Product factoryMethod() {
		// TODO Auto-generated method stub
		return new ConcreteProductA();
	}

}
