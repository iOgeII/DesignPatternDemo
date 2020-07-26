package exercise._7multiwindow;

import javax.swing.JInternalFrame;

public class InternalFrame extends JInternalFrame {

	// private InternalFrame() {}
	
	private static class HolderClass {
		private static JInternalFrame instance = new JInternalFrame("Î¨Ò»×Ó´°¿Ú", true, true);
	}

	public static JInternalFrame getInstance() {
		HolderClass.instance.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
		return HolderClass.instance;
	}
	
}
