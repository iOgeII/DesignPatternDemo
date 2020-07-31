package exercise._6OneTouchBackup;

public class MMCBackUp extends BackUp{

	private ContactManager cm;
	private ShortMessageManager smm;
	private PhotoManager pm;
	private SongManager sm;
	
	public MMCBackUp() {
		// TODO Auto-generated constructor stub
		cm = new ContactManager();
		smm = new ShortMessageManager();
		pm = new PhotoManager();
		sm = new SongManager();
	}
	
	@Override
	public void oneTouchBackup() {
		// TODO Auto-generated method stub
		System.out.println("[MMC]Ò»¼ü×ª´¢");
		cm.readContacts();
		System.out.println("´æ´¢ÖÐ...");
		smm.readShortMessages();
		System.out.println("´æ´¢ÖÐ...");
		pm.readPhotos();
		System.out.println("´æ´¢ÖÐ...");
		sm.readSongs();
		System.out.println("´æ´¢ÖÐ...");
		
	}

}
