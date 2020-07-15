package exercise._7os;

public class WindowsOS implements OS {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

	@Override
	public Text createText() {
		// TODO Auto-generated method stub
		return new WindowsText();
	}

}
