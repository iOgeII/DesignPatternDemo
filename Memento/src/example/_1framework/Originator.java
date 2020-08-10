package example._1framework;

public class Originator {

	private String state;
	
	public Originator(String state) {
		// TODO Auto-generated constructor stub
		this.state = state;
	}
	
	// 创建一个备忘录对象
	public Memento createMemento() {
		return new Memento(this);
	}
	
	// 根据备忘录对象恢复原发器状态
	public void restoreMemento(Memento m) {
		// 这里如果不使用getter 需要把备忘录类中的state成员变为包内可见
		state = m.state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
