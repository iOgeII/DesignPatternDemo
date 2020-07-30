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
		// ������������ҵ�񷽷���ʵ�֣�һ��ݹ���ó�Ա������ҵ�񷽷�
		for(Object obj:list) {
			((Component)obj).operation();
		}
	}

}
