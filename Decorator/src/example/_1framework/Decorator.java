package example._1framework;

public class Decorator extends Component {

	// ά��һ���Գ��󹹼����������
	private Component component;
	
	// ע��һ�����󹹼����͵Ķ���
	public Decorator(Component component) {
		// TODO Auto-generated constructor stub
		this.component = component;
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		// ����ԭҵ�񷽷�
		component.operation();
	}

}
