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
		System.out.println("[MMC]һ��ת��");
		cm.readContacts();
		System.out.println("�洢��...");
		smm.readShortMessages();
		System.out.println("�洢��...");
		pm.readPhotos();
		System.out.println("�洢��...");
		sm.readSongs();
		System.out.println("�洢��...");
		
	}

}
