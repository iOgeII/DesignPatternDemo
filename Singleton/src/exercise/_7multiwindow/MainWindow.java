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
		createInternalFrameButton = new JButton("单击创建一个内部窗体");
		mainDesktopPane.add(BorderLayout.SOUTH,createInternalFrameButton);
		JFrame mainFrame = new JFrame();
		mainFrame.add(mainDesktopPane);

        // 设置窗口最小尺寸
        mainFrame.setMinimumSize(new Dimension(500, 360));
        // 调整此窗口的大小，以适合其子组件的首选大小和布局
        mainFrame.pack();
        // 设置窗口相对于指定组件的位置
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        // 设置窗口尺寸是否固定不变
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
