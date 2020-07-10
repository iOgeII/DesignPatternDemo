package example._5simplify;

public abstract class Product {
	
	// ���в�Ʒ��Ĺ���ҵ�񷽷�
	public void methodSame() {
		System.out.println("���в�Ʒ��Ĺ���ҵ�񷽷���");
	}
	
	// ��������ҵ�񷽷�
	public abstract void methodDiff();

	// ����������Ϊ��Ʒ����ĳ�Ա����
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
