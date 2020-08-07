package exercise._6AnnouncementBoard;

import java.util.ArrayList;

public class Menu {

	private ArrayList<MenuItem> itemList = new ArrayList<MenuItem>();
	
	public void addMenuItem(MenuItem item) {
		itemList.add(item);
	}
	
	public void runall() {
		for (MenuItem menuItem : itemList) {
			menuItem.click();
		}
	}
}
