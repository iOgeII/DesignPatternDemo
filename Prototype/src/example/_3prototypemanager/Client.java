package example._3prototypemanager;

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
		ConcretePrototypeB cPrototype = new ConcretePrototypeB();
		cPrototype.setAttr("Rainy");
		ConcretePrototypeB copyConcretePrototype = cPrototype.clone();
		System.out.println("今日天气："+copyConcretePrototype.getAttr());
	}
}
