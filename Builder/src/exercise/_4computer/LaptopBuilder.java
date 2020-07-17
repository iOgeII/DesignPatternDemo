package exercise._4computer;

public class LaptopBuilder extends ComputerBuilder {
	
	public boolean isLaptop() {
		return true;
	}

	@Override
	public void BuildCPU() {
		// TODO Auto-generated method stub
		this.computer.setCPU("笔记本电脑的CPU");
	}

	@Override
	public void BuildMemory() {
		// TODO Auto-generated method stub
		this.computer.setMemory("笔记本电脑的内存");
	}

	@Override
	public void BuildHardware() {
		// TODO Auto-generated method stub
		this.computer.setHardware("笔记本电脑的硬盘");
	}

	@Override
	public void BuildHost() {
		// TODO Auto-generated method stub
		this.computer.setHost("笔记本电脑没有主机");
	}

	@Override
	public void BuildDisplay() {
		// TODO Auto-generated method stub
		this.computer.setDisplay("笔记本电脑的显示屏");
	}

}
