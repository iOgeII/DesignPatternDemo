package example._1framework;

public class Factory {

	public static Product getProduct(String arg) {
		Product product;
		if(arg.equalsIgnoreCase("A")) {
			product = new ConcreteProductA();
			System.out.println("工厂生产产品A。");
		}
		else if(arg.equalsIgnoreCase("B")) {
			product = new ConcreteProductB();
			System.out.println("工厂生产产品B。");
		}
		else {
			product =  null;
		}
		return product;
	}
}
