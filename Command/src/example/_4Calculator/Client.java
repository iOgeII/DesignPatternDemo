package example._4Calculator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorForm form = new CalculatorForm();
		AbstractCommand command = new AddCommand();
		form.setCommand(command);
		
		form.compute(10);
		form.undo();
		form.compute(17);
		form.compute(5);
		form.undo();
	}

}
