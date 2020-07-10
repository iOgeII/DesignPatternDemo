package example._4drawrectangle;

/**
 * 多种构造方法对应简单工厂的ConcreteProducts
 * @author 香南鹤砚
 *
 */
public class Rectangle {
	
	public Rectangle(int width, int height) {
		System.out.println("Rectangle: width = "+width+", height = "+height);
	}
	
	public Rectangle(int width) {
		System.out.println("Square: width = "+width);
	}

}
