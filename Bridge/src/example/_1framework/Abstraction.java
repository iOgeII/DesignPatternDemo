package example._1framework;

public abstract class Abstraction {

	protected Implementor impl;
	
	public void setImpl(Implementor impl) {
		this.impl = impl;
	}
	
	public abstract void operation();
}
