package example._1framework;

public class ConcreteBuilder extends Builder {

	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		this.product.setPartA("part A");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		this.product.setPartB("part B");
	}

	@Override
	public void buildPartC() {
		// TODO Auto-generated method stub
		this.product.setPartC("part C");
	}

}
