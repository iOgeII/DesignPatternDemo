package exercise._6ComponentLib;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component mainWindow,leftPanel,midPanel;
		Component button1,button2;
		Component textArea;
		
		mainWindow = new WindowContainer("主窗口");
		leftPanel = new PanelContainer("左部面板");
		midPanel = new PanelContainer("主面板");
		
		button1 = new ButtonComponent("左部按钮");
		button2 = new ButtonComponent("主按钮");
		
		textArea = new TextAreaComponent("主输入框");
		
		mainWindow.add(leftPanel);
		mainWindow.add(midPanel);
		leftPanel.add(button1);
		midPanel.add(button2);
		midPanel.add(textArea);
		
		mainWindow.useComponent();
	}

}
