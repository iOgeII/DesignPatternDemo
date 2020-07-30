package example._1framework;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public void operation() {
		// 调用原有业务方法
		super.operation();
		// 调用新增业务方法
		addedBehavior();
	}

	private void addedBehavior() {
		// TODO Auto-generated method stub
		System.out.println("装饰者：新增业务方法");
	}

}
