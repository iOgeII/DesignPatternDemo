package exercise._4PhoneFunc;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone simplePhone,jarPhone,complexPhone;
		simplePhone = new SimplePhone();
		simplePhone.ring();
		System.out.println("");
		System.out.println("-------------------");
		
		jarPhone = new JarPhone(simplePhone);
		jarPhone.ring();
		System.out.println("");
		System.out.println("-------------------");
		
		complexPhone = new ComplexPhone(jarPhone);
		complexPhone.ring();
		System.out.println("");
		System.out.println("-------------------");
		
	}

}
