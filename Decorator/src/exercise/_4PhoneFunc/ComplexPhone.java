package exercise._4PhoneFunc;

public class ComplexPhone extends AdvancedPhone {

	public ComplexPhone(Phone phone) {
		super(phone);
		// TODO Auto-generated constructor stub
	}

	public void ring() {
		super.ring();
		this.spirk();
	}
	
	public void spirk() {
		System.out.print("+µ∆π‚…¡À∏");
	}
}
