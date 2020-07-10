package example._1framework;

public abstract class Product {
	
	// 所有产品类的公共业务方法
	public void methodSame() {
		System.out.println("所有产品类的公共业务方法。");
	}
	
	// 声明抽象业务方法
	public abstract void methodDiff();

}
