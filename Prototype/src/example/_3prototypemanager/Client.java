package example._3prototypemanager;

public class Client {

	// 1.ͨ�ÿ�¡
//	public static void main(String[] args) {
//		ConcretePrototype cPrototype = new ConcretePrototype();
//		cPrototype.setAttr("Windy");
//		ConcretePrototype copyConcretePrototype = cPrototype.clone();
//		System.out.println("����������"+copyConcretePrototype.getAttr());
//	}
	
	// 2.ʵ��Cloneable�ӿ�
	public static void main(String[] args) {
		ConcretePrototypeB cPrototype = new ConcretePrototypeB();
		cPrototype.setAttr("Rainy");
		ConcretePrototypeB copyConcretePrototype = cPrototype.clone();
		System.out.println("����������"+copyConcretePrototype.getAttr());
	}
}
