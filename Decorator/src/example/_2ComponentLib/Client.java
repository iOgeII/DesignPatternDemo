package example._2ComponentLib;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component component,componentSB,componentBB;
		component = new Window();
		componentSB = new ScrollBarDecorator(component);
		componentSB.display();
		
		System.out.println("---------------------");
		
		componentBB = new BlackBorderDecorator(componentSB);
		componentBB.display();
	}

}
