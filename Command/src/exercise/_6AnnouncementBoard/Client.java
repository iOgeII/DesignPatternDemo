package exercise._6AnnouncementBoard;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Command open, create, edit;
		open = new OpenCommand(new BoardFunction());
		create = new CreateCommand(new BoardFunction());
		edit = new EditCommand(new BoardFunction());
		
		MenuItem openItem, createItem, editItem;
		openItem = new MenuItem(open);
		createItem = new MenuItem(create);
		editItem = new MenuItem(edit);
		
		Menu m = new Menu();
		m.addMenuItem(openItem);
		m.addMenuItem(createItem);
		m.addMenuItem(editItem);
		m.addMenuItem(openItem);
		
		m.runall();
	}

}
