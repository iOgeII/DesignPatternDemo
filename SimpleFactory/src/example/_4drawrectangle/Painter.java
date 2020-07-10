package example._4drawrectangle;

public class Painter {

	public static void main(String[] args) {
		Rectangle rt;
		rt = RectangleFactory.createSquare(20);
		rt = RectangleFactory.createRectangle(15, 20);
	}
}
