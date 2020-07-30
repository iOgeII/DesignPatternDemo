package exercise._5CafeCost;

public class Mocha extends Addin {

	public Mocha(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription()+this.getAddinDescription();
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return super.getCost()+this.getAddinCost();
	}

	public String getAddinDescription() {
		String addinDescription = new String(",Ä¦¿¨");
		return addinDescription;
	}
	
	public int getAddinCost() {
		int addinCost = 10;
		return addinCost;
	}
}
