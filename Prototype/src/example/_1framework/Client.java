package example._1framework;

public class Client {

	// 1.通用克隆
//	public static void main(String[] args) {
//		ConcretePrototype cPrototype = new ConcretePrototype();
//		cPrototype.setAttr("Windy");
//		ConcretePrototype copyConcretePrototype = cPrototype.clone();
//		System.out.println("今日天气："+copyConcretePrototype.getAttr());
//	}
	
	// 2.实现Cloneable接口
	public static void main(String[] args) {
		ConcretePrototype_cloneable cPrototype = new ConcretePrototype_cloneable();
		cPrototype.setAttr("Rainy");
		ConcretePrototype_cloneable copyConcretePrototype = cPrototype.clone();
		System.out.println("今日天气："+copyConcretePrototype.getAttr());
	}
}
