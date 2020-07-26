package exercise._7multiwindow;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class MainWindow {

	private JDesktopPane  mainDesktopPane;
	private JButton createInternalFrameButton;
	private JInternalFrame internalFrame;

	public MainWindow() {
		// TODO Auto-generated constructor stub


		mainDesktopPane = new JDesktopPane();
		mainDesktopPane.setLayout(new BorderLayout());
		createInternalFrameButton = new JButton("��������һ���ڲ�����");
		mainDesktopPane.add(BorderLayout.SOUTH,createInternalFrameButton);
		JFrame mainFrame = new JFrame();
		mainFrame.add(mainDesktopPane);

        // ���ô�����С�ߴ�
        mainFrame.setMinimumSize(new Dimension(500, 360));
        // �����˴��ڵĴ�С�����ʺ������������ѡ��С�Ͳ���
        mainFrame.pack();
        // ���ô��������ָ�������λ��
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        // ���ô��ڳߴ��Ƿ�̶�����
        mainFrame.setResizable(true);
		
		createInternalFrameButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(internalFrame == null) {
					internalFrame = InternalFrame.getInstance();
					internalFrame.setVisible(true);
					mainDesktopPane.add(internalFrame);
				}
				else {
					internalFrame.show();
				}
			}
		});
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainWindow mainWindow = new MainWindow();
	}

}
