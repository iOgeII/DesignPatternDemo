package exercise._4Mission;

public class Paizhang extends Officer {

	@Override
	public void order(Mission mission) {
		// TODO Auto-generated method stub
		if(mission.getEnemyNum()<50) {
			System.out.println("敌方人数"+mission.getEnemyNum()+"人，排长下达作战指令！");
		}
		else {
			this.successor.order(mission);
		}
	}

}
