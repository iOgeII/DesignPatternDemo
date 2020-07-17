package exercise._4computer;

public class DesktopBuilder extends ComputerBuilder {

	@Override
	public void BuildCPU() {
		// TODO Auto-generated method stub
		this.computer.setCPU("台式机的CPU");
	}

	@Override
	public void BuildMemory() {
		// TODO Auto-generated method stub
		this.computer.setMemory("台式机的内存");
	}

	@Override
	public void BuildHardware() {
		// TODO Auto-generated method stub
		this.computer.setHardware("台式机的硬盘");
	}

	@Override
	public void BuildHost() {
		// TODO Auto-generated method stub
		this.computer.setHost("台式机的主机");
	}

	@Override
	public void BuildDisplay() {
		// TODO Auto-generated method stub
		this.computer.setDisplay("台式机的显示器");
	}

}
