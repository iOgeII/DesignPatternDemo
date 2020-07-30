package exercise._4PhoneFunc;

public class JarPhone extends AdvancedPhone {

	public JarPhone(Phone phone) {
		super(phone);
		// TODO Auto-generated constructor stub
	}
	
	public void ring() {
		super.ring();
		this.jar();
	}
	
	public void jar() {
		System.out.print("+Õñ¶¯");
	}

}
