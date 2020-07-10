package example._1framework;

public class Client {

	public static void main(String args[]) {
		Product product;
		product = Factory.getProduct("A");
		product.methodSame();
		product.methodDiff();
		product = Factory.getProduct("B");
		product.methodSame();
		product.methodDiff();
	}
}
