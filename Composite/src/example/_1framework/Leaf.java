package example._1framework;

public class Leaf extends Component {

	@Override
	public void add(Component c) {
		// 异常处理或错误提示
		System.out.println("[叶子结点]无法增加子结点");
	}

	@Override
	public void remove(Component c) {
		// 异常处理或错误提示
		System.out.println("[叶子结点]无法删除子结点");
	}

	@Override
	public Component getChild(int i) {
		// 异常处理或错误提示
		System.out.println("[叶子结点]无法获取子结点");
		return null;
	}

	@Override
	public void operation() {
		// 叶子构件具体业务方法实现
		System.out.println("[叶子结点]操作操作操作");
	}

}
