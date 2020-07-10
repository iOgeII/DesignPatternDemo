package example._4drawrectangle;

public class RectangleFactory {

	public static Rectangle createRectangle(int width, int height) {
		Rectangle r;
		System.out.println("Creating Rectangle......");
		r = new Rectangle(width, height);
		return r;
	}
	
	public static Rectangle createSquare(int width) {
		Rectangle r;
		System.out.println("Creating Square......");
		r = new Rectangle(width);
		return r;
	}
}
