package example._2toycar;

public class PoliceCarAdapter extends CarController {

	private PoliceSound sound;
	private PoliceLamp lamp;
	
	public PoliceCarAdapter() {
		sound = new PoliceSound();
		lamp = new PoliceLamp();
	}
	
	@Override
	public void phonate() {
		// TODO Auto-generated method stub
		sound.alarmSound();
	}

	@Override
	public void twinkle() {
		// TODO Auto-generated method stub
		lamp.alarmLamp();
	}

}
