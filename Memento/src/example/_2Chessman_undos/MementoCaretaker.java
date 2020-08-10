package example._2Chessman_undos;

import java.util.ArrayList;

public class MementoCaretaker {

	private ArrayList<ChessmanMemento> mementolist = new ArrayList<ChessmanMemento>();

	public ChessmanMemento getMemento(int i) {
		return mementolist.get(i);
	}

	public void setMemento(ChessmanMemento memento) {
		mementolist.add(memento);
	}

}
