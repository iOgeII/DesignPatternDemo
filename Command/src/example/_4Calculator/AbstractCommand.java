package example._4Calculator;

public abstract class AbstractCommand {

	// ��������ִ�з��� execute()
	public abstract int execute(int value);
	// ������������ undo()
	public abstract int undo();
}
