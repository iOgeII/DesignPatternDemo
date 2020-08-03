package exercise._4Mission;

public abstract class Officer {

	protected Officer successor;
	
	public void setSuccessor(Officer successor) {
		this.successor = successor;
	}
	
	public abstract void order(Mission mission);
}
