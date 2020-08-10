package example._1framework;

class Memento {

	String state;
	
	public Memento(Originator o) {
		// TODO Auto-generated constructor stub
		state = o.getState();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
