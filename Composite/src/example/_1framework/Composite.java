package example._1framework;

import java.util.ArrayList;

public class Composite extends Component {

	private ArrayList<Component> list = new ArrayList<Component>();
	
	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		list.add(c);
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		list.remove(c);
	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		return list.get(i);
	}

	@Override
	public void operation() {
		// 容器构件具体业务方法的实现，一般递归调用成员构件的业务方法
		for(Object obj:list) {
			((Component)obj).operation();
		}
	}

}
