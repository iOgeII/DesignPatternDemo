package exercise._5shape;

public class Client {

	public static void main(String[] args) {
		Shape s;
		try {
			s = ShapeFactory.getShape("circle");
			s.draw();
			s.erase();
			
			s = ShapeFactory.getShape("triangle");
			s.draw();
			s.erase();
			
			// throw exception situation
			s = ShapeFactory.getShape("square");
			s.draw();
			s.erase();
			
		} catch (UnsupportedShapeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
