package exercise._4computer;

public class DesktopBuilder extends ComputerBuilder {

	@Override
	public void BuildCPU() {
		// TODO Auto-generated method stub
		this.computer.setCPU("̨ʽ����CPU");
	}

	@Override
	public void BuildMemory() {
		// TODO Auto-generated method stub
		this.computer.setMemory("̨ʽ�����ڴ�");
	}

	@Override
	public void BuildHardware() {
		// TODO Auto-generated method stub
		this.computer.setHardware("̨ʽ����Ӳ��");
	}

	@Override
	public void BuildHost() {
		// TODO Auto-generated method stub
		this.computer.setHost("̨ʽ��������");
	}

	@Override
	public void BuildDisplay() {
		// TODO Auto-generated method stub
		this.computer.setDisplay("̨ʽ������ʾ��");
	}

}
