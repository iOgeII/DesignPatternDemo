package example._5simplify;

public abstract class Product {
	
	// 所有产品类的公共业务方法
	public void methodSame() {
		System.out.println("所有产品类的公共业务方法。");
	}
	
	// 声明抽象业务方法
	public abstract void methodDiff();

	// 将工厂类作为产品父类的成员方法
	public static Product factoryMethod(String arg) {
		Product p;
		if(arg.equalsIgnoreCase("A")) {
			System.out.println("Producing product A");
			p = new ConcreteProductA();
		}
		else if(arg.equalsIgnoreCase("B")) {
			System.out.println("Producing product B");
			p = new ConcreteProductB();
		}
		else {
			p = null;
		}
		return p;
	}
	
}
