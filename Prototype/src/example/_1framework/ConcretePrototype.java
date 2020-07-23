package example._1framework;

public class ConcretePrototype extends Prototype {

	private String attr;
	
	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}

	@Override
	public ConcretePrototype clone() {
		// TODO Auto-generated method stub
		ConcretePrototype prototype = new ConcretePrototype();
		prototype.setAttr(this.attr);
		return prototype;
	}

}
