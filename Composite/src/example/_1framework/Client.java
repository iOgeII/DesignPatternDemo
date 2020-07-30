package example._1framework;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leaf lf = new Leaf();
		Composite c = new Composite();
		c.add(lf);
		c.operation();
		c.getChild(0).operation();
	}

}
