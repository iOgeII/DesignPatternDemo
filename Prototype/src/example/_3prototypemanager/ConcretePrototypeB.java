package example._3prototypemanager;

public class ConcretePrototypeB extends Prototype{

	private String attr;
	
	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}
	
	@Override
	public ConcretePrototypeB clone() {
		// TODO Auto-generated method stub
		ConcretePrototypeB prototype = new ConcretePrototypeB();
		prototype.setAttr(this.attr);
		return prototype;
	}

}
