package exercise._4Mission;

public class Banzhang extends Officer{

	@Override
	public void order(Mission mission) {
		// TODO Auto-generated method stub
		if(mission.getEnemyNum()<10) {
			System.out.println("�з�����"+mission.getEnemyNum()+"�ˣ��೤�´���սָ�");
		}
		else {
			this.successor.order(mission);
		}
	}

	

}
