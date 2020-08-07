package example._2FunctionButton;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Command command = (Command)XMLUtil.getBean();
		FunctionButton fb = new FunctionButton();
		fb.setCommand(command);
		fb.click();
	}

}
