package exercise._5CafeCost;

public class Milk extends Addin {

	public Milk(Beverage beverage) {
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
		String addinDescription = new String(",еёдл");
		return addinDescription;
	}
	
	public int getAddinCost() {
		int addinCost = 6;
		return addinCost;
	}

}
