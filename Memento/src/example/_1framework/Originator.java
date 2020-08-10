package example._1framework;

public class Originator {

	private String state;
	
	public Originator(String state) {
		// TODO Auto-generated constructor stub
		this.state = state;
	}
	
	// ����һ������¼����
	public Memento createMemento() {
		return new Memento(this);
	}
	
	// ���ݱ���¼����ָ�ԭ����״̬
	public void restoreMemento(Memento m) {
		// ���������ʹ��getter ��Ҫ�ѱ���¼���е�state��Ա��Ϊ���ڿɼ�
		state = m.state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
