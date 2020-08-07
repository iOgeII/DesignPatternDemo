package example._3CommandQueue;

public class ConcreteCommand extends Command {

	private Receiver receiver;
	
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}
