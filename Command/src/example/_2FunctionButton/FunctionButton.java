package example._2FunctionButton;

public class FunctionButton {

	// ά��һ������������������
	private Command command;
	
	// Ϊ���ܼ�ע������
	public void setCommand(Command command) {
		this.command = command;
	}
	
	// ��������ķ���
	public void click() {
		System.out.print("�������ܼ���");
		command.execute();
	}
}
