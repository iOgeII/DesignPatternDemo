package exercise._4Mission;

public class Banzhang extends Officer{

	@Override
	public void order(Mission mission) {
		// TODO Auto-generated method stub
		if(mission.getEnemyNum()<10) {
			System.out.println("敌方人数"+mission.getEnemyNum()+"人，班长下达作战指令！");
		}
		else {
			this.successor.order(mission);
		}
	}

	

}
