package example._3prototypemanager;

public class ConcretePrototypeA extends Prototype {

	private String attr;
	
	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}

	@Override
	public ConcretePrototypeA clone() {
		// TODO Auto-generated method stub
		ConcretePrototypeA prototype = new ConcretePrototypeA();
		prototype.setAttr(this.attr);
		return prototype;
	}

}
