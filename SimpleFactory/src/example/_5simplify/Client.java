package example._5simplify;

public class Client {

	public static void main(String args[]) {
		Product product;
		product = Product.factoryMethod("A");
		product.methodSame();
		product.methodDiff();
		product = Product.factoryMethod("B");
		product.methodSame();
		product.methodDiff();
	}
}
