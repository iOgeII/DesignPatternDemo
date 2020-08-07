package example._2RobotController;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String instruction = "down run 10 and left move 20 and up run 17";
		InstructionHandler handler = new InstructionHandler();
		handler.handle(instruction);
		System.out.println(handler.output());
	}

}
