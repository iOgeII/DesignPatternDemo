package example._2OnlineMatchGame;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����۲�Ŀ�����
		AllyControlCenter acc = new ConcreteAllyControlCenter("��ӹȺ��");
		
		// ����4���۲��߶���
		Observer player1, player2, player3, player4;
		
		player1 = new Player("���");
		acc.join(player1);
		
		player2 = new Player("�����");
		acc.join(player2);
		
		player3 = new Player("���޼�");
		acc.join(player3);
		
		player4 = new Player("����");
		acc.join(player4);
		
		player1.beAttacked(acc);
	}

}
