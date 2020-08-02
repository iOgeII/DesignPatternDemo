package example._3String;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcd";
		String str2 = "abcd";
		String str3 = "ab"+"cd";
		String str4 = "ab";
		str4 += "cd";
		
		System.out.println("str1 == str2:"+(str1 == str2));
		System.out.println("str2 == str3:"+(str2 == str3));
		System.out.println("str3 == str4:"+(str3 == str4));
		
		str2 += "e";
		System.out.println("str1 == str2:"+(str1 == str2));
	}

}
