package exercise._6FileEditor;

import java.util.Hashtable;

public class FlyweightFactory {

	private static FlyweightFactory instance = new FlyweightFactory();
	private Hashtable flyweights;
	
	private FlyweightFactory() {
		flyweights = new Hashtable();
		Jpg j = new Jpg();
		flyweights.put("jpg", j);
		Gif g = new Gif();
		flyweights.put("gif", g);
		Mp4 m = new Mp4();
		flyweights.put("mp4", m);
	}
	
	public static FlyweightFactory getInstance() {
		return instance;
	}
	
	public Flyweight getInsertItem(String key) {
		return (Flyweight)flyweights.get(key);
	}
}
