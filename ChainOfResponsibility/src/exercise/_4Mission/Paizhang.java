package exercise._4Mission;

public class Paizhang extends Officer {

	@Override
	public void order(Mission mission) {
		// TODO Auto-generated method stub
		if(mission.getEnemyNum()<50) {
			System.out.println("�з�����"+mission.getEnemyNum()+"�ˣ��ų��´���սָ�");
		}
		else {
			this.successor.order(mission);
		}
	}

}
