
public class JavaReflection {

	public static Object testClass() {
		Object obj;
		try {
			Class c;
			c = Class.forName("java.lang.String");
			System.out.println(c);
			obj = c.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			obj = null;
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			obj = null;
		}
		return obj;
	}
	
	public static void main(String[] args) {
		testClass();
	}
}
