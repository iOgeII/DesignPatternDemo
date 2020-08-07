package exercise._3Switch;

public class LightCommand extends Command {

	private Light light = new Light();
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		light.LightOn();
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		light.LightOff();
	}
}
