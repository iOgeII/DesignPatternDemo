package example._1framework;

public class Decorator extends Component {

	// 维护一个对抽象构件对象的引用
	private Component component;
	
	// 注入一个抽象构件类型的对象
	public Decorator(Component component) {
		// TODO Auto-generated constructor stub
		this.component = component;
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		// 调用原业务方法
		component.operation();
	}

}
