package exercise._4computer;

public class ServerBuilder extends ComputerBuilder {

	public boolean isServer() {
		return true;
	}
	
	@Override
	public void BuildCPU() {
		// TODO Auto-generated method stub
		this.computer.setCPU("��������CPU");
	}

	@Override
	public void BuildMemory() {
		// TODO Auto-generated method stub
		this.computer.setMemory("���������ڴ�");
	}

	@Override
	public void BuildHardware() {
		// TODO Auto-generated method stub
		this.computer.setHardware("��������Ӳ��");
	}

	@Override
	public void BuildHost() {
		// TODO Auto-generated method stub
		this.computer.setHost("������������");
	}

	@Override
	public void BuildDisplay() {
		// TODO Auto-generated method stub
		this.computer.setDisplay("������û����ʾ��");
	}

}
