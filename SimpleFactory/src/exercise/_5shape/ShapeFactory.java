package exercise._5shape;

public class ShapeFactory {

	public static Shape getShape(String type) throws UnsupportedShapeException {
		if(type.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		else if(type.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		else if(type.equalsIgnoreCase("Triangle")) {
			return new Triangle();
		}
		else {
			throw new UnsupportedShapeException();
		}
	}
	
}
