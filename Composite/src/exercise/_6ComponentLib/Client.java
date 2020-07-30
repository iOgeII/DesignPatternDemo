package exercise._6ComponentLib;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component mainWindow,leftPanel,midPanel;
		Component button1,button2;
		Component textArea;
		
		mainWindow = new WindowContainer("������");
		leftPanel = new PanelContainer("�����");
		midPanel = new PanelContainer("�����");
		
		button1 = new ButtonComponent("�󲿰�ť");
		button2 = new ButtonComponent("����ť");
		
		textArea = new TextAreaComponent("�������");
		
		mainWindow.add(leftPanel);
		mainWindow.add(midPanel);
		leftPanel.add(button1);
		midPanel.add(button2);
		midPanel.add(textArea);
		
		mainWindow.useComponent();
	}

}
