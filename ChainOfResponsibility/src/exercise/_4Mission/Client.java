package exercise._4Mission;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Officer banzhang,paizhang,yingzhang,congress;
		
		banzhang = new Banzhang();
		paizhang = new Paizhang();
		yingzhang = new Yingzhang();
		congress = new Congress();
		
		banzhang.setSuccessor(paizhang);
		paizhang.setSuccessor(yingzhang);
		yingzhang.setSuccessor(congress);
		
		banzhang.order(new Mission(8));
		banzhang.order(new Mission(25));
		banzhang.order(new Mission(100));
		banzhang.order(new Mission(1000));
	}

}
