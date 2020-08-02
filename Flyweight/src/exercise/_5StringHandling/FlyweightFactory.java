package exercise._5StringHandling;

import java.util.Hashtable;

public class FlyweightFactory {

	private static FlyweightFactory instance = new FlyweightFactory();
	private Hashtable flyweights;
	
	private FlyweightFactory() {
		flyweights = new Hashtable();
		StringJava strjava = new StringJava();
		flyweights.put("java",strjava);
	}
	
	public static FlyweightFactory getInstance() {
		return instance;		
	}
	
	public Flyweight getFlyweight(String key) {
		return (Flyweight)flyweights.get(key);
	}
}
