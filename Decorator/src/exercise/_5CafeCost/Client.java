package exercise._5CafeCost;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage,addin1,addin2;
		
		beverage = new Espresso();
		addin1 = new Mocha(beverage);
		addin2 = new Milk(addin1);
		
		System.out.println(addin2.getDescription()+" гд"+addin2.getCost());
	}

}
