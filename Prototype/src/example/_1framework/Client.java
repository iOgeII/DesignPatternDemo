package example._1framework;

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
		ConcretePrototype_cloneable cPrototype = new ConcretePrototype_cloneable();
		cPrototype.setAttr("Rainy");
		ConcretePrototype_cloneable copyConcretePrototype = cPrototype.clone();
		System.out.println("����������"+copyConcretePrototype.getAttr());
	}
}
