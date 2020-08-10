package example._2Chessman_undos;

public class Client {

	private static int index = -1;
	private static MementoCaretaker mc = new MementoCaretaker();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Chessman chess = new Chessman("车", 1, 1);
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
		System.out.println("*****撤销悔棋*****");
		index++;
		chess.restore(mc.getMemento(index));
		System.out.println("棋子"+chess.getLabel()+"当前位置为："+"第"+chess.getX()+"行"+"第"+chess.getY()+"列.");
	}

	private static void undo(Chessman chess, int index2) {
		// TODO Auto-generated method stub
		System.out.println("*****悔棋*****");
		index--;
		chess.restore(mc.getMemento(index));
		System.out.println("棋子"+chess.getLabel()+"当前位置为："+"第"+chess.getX()+"行"+"第"+chess.getY()+"列.");
	}

	private static void play(Chessman chess) {
		// TODO Auto-generated method stub
		// 自动保存
		mc.setMemento(chess.save());
		index++;
		System.out.println("棋子"+chess.getLabel()+"当前位置为："+"第"+chess.getX()+"行"+"第"+chess.getY()+"列.");
	}

}
