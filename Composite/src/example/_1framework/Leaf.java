package example._1framework;

public class Leaf extends Component {

	@Override
	public void add(Component c) {
		// �쳣����������ʾ
		System.out.println("[Ҷ�ӽ��]�޷������ӽ��");
	}

	@Override
	public void remove(Component c) {
		// �쳣����������ʾ
		System.out.println("[Ҷ�ӽ��]�޷�ɾ���ӽ��");
	}

	@Override
	public Component getChild(int i) {
		// �쳣����������ʾ
		System.out.println("[Ҷ�ӽ��]�޷���ȡ�ӽ��");
		return null;
	}

	@Override
	public void operation() {
		// Ҷ�ӹ�������ҵ�񷽷�ʵ��
		System.out.println("[Ҷ�ӽ��]������������");
	}

}
