package example._1framework;

public class Director {

	// ×¢Èë¶ÔÏó
	private Builder builder;
	
	public Director(Builder builder) {
		// TODO Auto-generated constructor stub
		this.builder = builder;
	}
	
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public Product construct() {
		this.builder.buildPartA();
		this.builder.buildPartB();
		this.builder.buildPartC();
		return this.builder.getResult();
	}
	
}
