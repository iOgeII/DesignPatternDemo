package example._2Chessman;

// ԭ������
public class Chessman {

	private String label;
	private int x;
	private int y;
	
	public Chessman(String label,int x,int y) {
		// TODO Auto-generated constructor stub
		this.label = label;
		this.x = x;
		this.y = y;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	// ����״̬
	public ChessmanMemento save() {
		return new ChessmanMemento(this.label, this.x, this.y);
	}
	
	// �ָ�״̬
	public void restore(ChessmanMemento memento) {
		this.label = memento.getLabel();
		this.x = memento.getX();
		this.y = memento.getY();
	}
	
}
