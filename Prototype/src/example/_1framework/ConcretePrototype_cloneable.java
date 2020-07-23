package example._1framework;

public class ConcretePrototype_cloneable implements Cloneable{

	private String attr;
	
	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}
	
	@Override
	public ConcretePrototype_cloneable clone() {
		// TODO Auto-generated method stub
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Not support cloneable");
		}
		return (ConcretePrototype_cloneable)object;
	}

}
