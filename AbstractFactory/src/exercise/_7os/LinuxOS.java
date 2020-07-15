package exercise._7os;

public class LinuxOS implements OS {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new LinuxButton();
	}

	@Override
	public Text createText() {
		// TODO Auto-generated method stub
		return new LinuxText();
	}

}
