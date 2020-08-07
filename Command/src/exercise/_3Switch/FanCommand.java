package exercise._3Switch;

public class FanCommand extends Command {

	private Fan fan = new Fan();
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		fan.FanOn();
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		fan.FanOff();
	}

}
