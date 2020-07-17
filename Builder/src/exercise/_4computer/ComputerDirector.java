package exercise._4computer;

public class ComputerDirector {

	public Computer construct(ComputerBuilder cb) {
		Computer computer;
		cb.BuildCPU();
		cb.BuildMemory();
		cb.BuildHardware();
		if(!cb.isLaptop()) {
			cb.BuildHost();
		}
		if(!cb.isServer()) {
			cb.BuildDisplay();
		}
		computer = cb.createComputer();
		return computer;
	}
}
