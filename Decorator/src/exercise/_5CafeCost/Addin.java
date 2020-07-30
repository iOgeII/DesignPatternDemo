package exercise._5CafeCost;

public class Addin extends Beverage {

	private Beverage beverage;
	
	public Addin(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription();
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost();
	}

}
