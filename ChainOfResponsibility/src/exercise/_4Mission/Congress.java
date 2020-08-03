package exercise._4Mission;

public class Congress extends Officer {

	@Override
	public void order(Mission mission) {
		// TODO Auto-generated method stub
		System.out.println("敌方人数"+mission.getEnemyNum()+"人，开会讨论！");
	}

}
