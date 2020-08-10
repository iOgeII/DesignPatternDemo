package example._2Chessman_undos;

public class Client {

	private static int index = -1;
	private static MementoCaretaker mc = new MementoCaretaker();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Chessman chess = new Chessman("��", 1, 1);
		play(chess);
		
		chess.setY(4);
		play(chess);
		
		chess.setX(5);
		play(chess);
		
		undo(chess,index);
		undo(chess,index);
		redo(chess,index);
		redo(chess,index);
		
	}

	private static void redo(Chessman chess, int index2) {
		// TODO Auto-generated method stub
		System.out.println("*****��������*****");
		index++;
		chess.restore(mc.getMemento(index));
		System.out.println("����"+chess.getLabel()+"��ǰλ��Ϊ��"+"��"+chess.getX()+"��"+"��"+chess.getY()+"��.");
	}

	private static void undo(Chessman chess, int index2) {
		// TODO Auto-generated method stub
		System.out.println("*****����*****");
		index--;
		chess.restore(mc.getMemento(index));
		System.out.println("����"+chess.getLabel()+"��ǰλ��Ϊ��"+"��"+chess.getX()+"��"+"��"+chess.getY()+"��.");
	}

	private static void play(Chessman chess) {
		// TODO Auto-generated method stub
		// �Զ�����
		mc.setMemento(chess.save());
		index++;
		System.out.println("����"+chess.getLabel()+"��ǰλ��Ϊ��"+"��"+chess.getX()+"��"+"��"+chess.getY()+"��.");
	}

}
