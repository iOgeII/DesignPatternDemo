package example._2Igo;

import java.util.Hashtable;

public class IgoChessmanFactory {

	private static IgoChessmanFactory instance = new IgoChessmanFactory();
	private static Hashtable chessmanTable;
	
	private IgoChessmanFactory() {
		chessmanTable = new Hashtable();
		IgoChessman black,white;
		black = new BlackIgoChessman();
		white = new WhiteIgoChessman();
		chessmanTable.put("b",black);
		chessmanTable.put("w",white);
	}
	
	public static IgoChessmanFactory getInstance() {
		return instance;
	}
	
	public static IgoChessman getIgoChessman(String key) {
		return (IgoChessman)chessmanTable.get(key);
	}
}
