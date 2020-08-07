package example._4Calculator;

public abstract class AbstractCommand {

	// 声明命令执行方法 execute()
	public abstract int execute(int value);
	// 声明撤销方法 undo()
	public abstract int undo();
}
