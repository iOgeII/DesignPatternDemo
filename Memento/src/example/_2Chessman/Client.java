package example._2Chessman;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MementoCaretaker mc = new MementoCaretaker();
		Chessman chess = new Chessman("��", 1, 1);
		display(chess);
		mc.setMemento(chess.save());
		chess.setY(4);
		display(chess);
		mc.setMemento(chess.save());
		chess.setX(5);
		display(chess);
		System.out.println("*****����*****");
		chess.restore(mc.getMemento());
		display(chess);
	}

	private static void display(Chessman chess) {
		// TODO Auto-generated method stub
		System.out.println("����"+chess.getLabel()+"��ǰλ��Ϊ��"+"��"+chess.getX()+"��"+"��"+chess.getY()+"��.");
	}

}
