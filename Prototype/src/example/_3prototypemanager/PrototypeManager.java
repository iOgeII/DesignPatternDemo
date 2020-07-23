package example._3prototypemanager;

import java.util.Hashtable;

public class PrototypeManager {

	private Hashtable prototypeHashtable = new Hashtable();
	public PrototypeManager() {
		prototypeHashtable.put("A", new ConcretePrototypeA());
		prototypeHashtable.put("B", new ConcretePrototypeB());
	}
	
	public void add(String key, Prototype prototype) {
		prototypeHashtable.put(key, prototype);
	}
	
	public Prototype get(String key) {
		Prototype clone = null;
		clone = ((Prototype)prototypeHashtable.get(key)).clone();
		return clone;
	}
	
}
