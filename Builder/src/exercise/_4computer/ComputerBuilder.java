package exercise._4computer;

public abstract class ComputerBuilder {

	protected Computer computer = new Computer();
	
	public abstract void BuildCPU();
	public abstract void BuildMemory();
	public abstract void BuildHardware();
	public abstract void BuildHost();
	public abstract void BuildDisplay();
	
	public boolean isLaptop() {
		return false;
	}
	
	public boolean isServer() {
		return false;
	}
	
	public Computer createComputer() {
		return this.computer;
	}
}
