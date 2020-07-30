package example._2ComponentLib;

public class ScrollBarDecorator extends ComponentDecorator {

	public ScrollBarDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		this.setScrollBar();
		super.display();
	}

	public void setScrollBar() {
		// TODO Auto-generated method stub
		System.out.println("为构件增加滚动条！");
	}

}
