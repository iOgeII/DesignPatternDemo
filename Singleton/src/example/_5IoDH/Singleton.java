package example._5IoDH;

// Initalization on Demand Holder
public class Singleton {
	
	private Singleton() {}
	
	// ¾²Ì¬ÄÚ²¿Àà
	private static class HolderClass {
		private final static Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return HolderClass.instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1,s2;
		s1 = Singleton.getInstance();
		s2 = Singleton.getInstance();
		System.out.println(s1==s2);
	}

}
