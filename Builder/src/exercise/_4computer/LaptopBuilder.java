package exercise._4computer;

public class LaptopBuilder extends ComputerBuilder {
	
	public boolean isLaptop() {
		return true;
	}

	@Override
	public void BuildCPU() {
		// TODO Auto-generated method stub
		this.computer.setCPU("�ʼǱ����Ե�CPU");
	}

	@Override
	public void BuildMemory() {
		// TODO Auto-generated method stub
		this.computer.setMemory("�ʼǱ����Ե��ڴ�");
	}

	@Override
	public void BuildHardware() {
		// TODO Auto-generated method stub
		this.computer.setHardware("�ʼǱ����Ե�Ӳ��");
	}

	@Override
	public void BuildHost() {
		// TODO Auto-generated method stub
		this.computer.setHost("�ʼǱ�����û������");
	}

	@Override
	public void BuildDisplay() {
		// TODO Auto-generated method stub
		this.computer.setDisplay("�ʼǱ����Ե���ʾ��");
	}

}
