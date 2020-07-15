package exercise._7os;

public class Client {

	public static void main(String[] args) {
		OS os;
		Button bt;
		Text txt;
		
		os = (OS)XMLUtil.getBean();
		bt = os.createButton();
		txt = os.createText();
		
		bt.display();
		txt.display();
	}
}
