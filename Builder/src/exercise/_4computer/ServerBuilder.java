package exercise._4computer;

public class ServerBuilder extends ComputerBuilder {

	public boolean isServer() {
		return true;
	}
	
	@Override
	public void BuildCPU() {
		// TODO Auto-generated method stub
		this.computer.setCPU("服务器的CPU");
	}

	@Override
	public void BuildMemory() {
		// TODO Auto-generated method stub
		this.computer.setMemory("服务器的内存");
	}

	@Override
	public void BuildHardware() {
		// TODO Auto-generated method stub
		this.computer.setHardware("服务器的硬盘");
	}

	@Override
	public void BuildHost() {
		// TODO Auto-generated method stub
		this.computer.setHost("服务器的主机");
	}

	@Override
	public void BuildDisplay() {
		// TODO Auto-generated method stub
		this.computer.setDisplay("服务器没有显示器");
	}

}
