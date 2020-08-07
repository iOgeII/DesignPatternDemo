package exercise._4CalculatorAdvance;

public class AddCommand extends AbstractCommand {

	private Adder adder = new Adder();
//	private int value;
	
	// ʵ�ֳ�����������������execute()���������üӷ���ļӷ�����
	@Override
	public int execute(int value) {
		// TODO Auto-generated method stub
		this.value = value;
		return adder.add(value);

	}

	// ʵ�ֳ�����������������undo()������ͨ����һ���෴����ʵ�ּӷ��������
	@Override
	public int undo() {
		// TODO Auto-generated method stub
		return adder.add(-this.value);

	}

}
