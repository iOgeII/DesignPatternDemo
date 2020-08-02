package exercise._5StringHandling;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyweightFactory ff = FlyweightFactory.getInstance();
		
		StringJava sj1 = (StringJava) ff.getFlyweight("java");
		StringJava sj2 = (StringJava) ff.getFlyweight("java");
		
		System.out.println("String1==String2:"+(sj1==sj2));
		
		sj1.stringStyle(new Style("ºìÉ«", "10ºÅ×Ö"));
		sj2.stringStyle(new Style("×ÏÉ«", "18ºÅ×Ö"));
	}

}
