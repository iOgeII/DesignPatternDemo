package exercise._3Switch;

final class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switch s = new Switch();
		s.setCommand(new FanCommand());
		s.on();
		s.off();
		
		s.setCommand(new LightCommand());
		s.on();
		s.off();
	}

}
