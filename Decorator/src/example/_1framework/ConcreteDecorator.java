package example._1framework;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public void operation() {
		// ����ԭ��ҵ�񷽷�
		super.operation();
		// ��������ҵ�񷽷�
		addedBehavior();
	}

	private void addedBehavior() {
		// TODO Auto-generated method stub
		System.out.println("װ���ߣ�����ҵ�񷽷�");
	}

}
