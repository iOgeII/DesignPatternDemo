package exercise._5StringHandling;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyweightFactory ff = FlyweightFactory.getInstance();
		
		StringJava sj1 = (StringJava) ff.getFlyweight("java");
		StringJava sj2 = (StringJava) ff.getFlyweight("java");
		
		System.out.println("String1==String2:"+(sj1==sj2));
		
		sj1.stringStyle(new Style("��ɫ", "10����"));
		sj2.stringStyle(new Style("��ɫ", "18����"));
	}

}
