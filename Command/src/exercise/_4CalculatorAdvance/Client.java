package exercise._4CalculatorAdvance;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorForm form = new CalculatorForm();
		AbstractCommand command = new AddCommand();
		
		form.compute(command,10);
		form.undo();
		form.compute(command,17);
		form.compute(command,5);
		form.undo();
		form.undo();
		form.redo();
		form.redo();
	}

}
