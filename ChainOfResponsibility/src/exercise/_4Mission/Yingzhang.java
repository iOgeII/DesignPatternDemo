package exercise._4Mission;

public class Yingzhang extends Officer {

	@Override
	public void order(Mission mission) {
		// TODO Auto-generated method stub
		if(mission.getEnemyNum()<200) {
			System.out.println("�з�����"+mission.getEnemyNum()+"�ˣ�Ӫ���´���սָ�");
		}
		else {
			this.successor.order(mission);
		}
	}

}
