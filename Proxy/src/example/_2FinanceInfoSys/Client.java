package example._2FinanceInfoSys;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Searcher searcher;
		searcher = (Searcher)XMLUtil.getBean();
		String result = searcher.doSearch("杨过", "玉女心经");
	}

}
