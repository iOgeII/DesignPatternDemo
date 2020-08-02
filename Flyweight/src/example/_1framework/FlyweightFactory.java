package example._1framework;

import java.util.HashMap;

public class FlyweightFactory {

	private HashMap flyweights = new HashMap();
	
	public Flyweight getFlyweight(String key) {
		if(flyweights.containsKey(key)) {
			return (Flyweight) flyweights.get(key);
		}
		else {
			Flyweight fw = new ConcreteFlyweight(key);
			flyweights.put(key,fw);
			return fw;
		}
	}
}
