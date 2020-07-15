package exercise._7os;

public class UnixOS implements OS {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new UnixButton();
	}

	@Override
	public Text createText() {
		// TODO Auto-generated method stub
		return new UnixText();
	}

}
