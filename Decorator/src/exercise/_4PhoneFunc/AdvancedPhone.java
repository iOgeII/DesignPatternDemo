package exercise._4PhoneFunc;

public class AdvancedPhone extends Phone {

	private Phone phone;
	
	public AdvancedPhone(Phone phone) {
		// TODO Auto-generated constructor stub
		this.phone = phone;
	}
	
	@Override
	public void ring() {
		// TODO Auto-generated method stub
		phone.ring();
	}

}
