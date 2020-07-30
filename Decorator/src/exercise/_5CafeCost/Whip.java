package exercise._5CafeCost;

public class Whip extends Addin {

	public Whip(Beverage beverage) {
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
		String addinDescription = new String(",длещ");
		return addinDescription;
	}
	
	public int getAddinCost() {
		int addinCost = 8;
		return addinCost;
	}

}
