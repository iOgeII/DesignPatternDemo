package exercise._5EduOADoc;

public class Office extends Organization{

	private String name;
	
	public Office(String name) {
		this.name = name;
	}

	@Override
	public void add(Organization o) {
		// TODO Auto-generated method stub
		System.out.println("�Բ��𣬲�֧�ָò���");
	}

	@Override
	public void remove(Organization o) {
		// TODO Auto-generated method stub
		System.out.println("�Բ��𣬲�֧�ָò���");
	}

	@Override
	public Organization getChild(int i) {
		// TODO Auto-generated method stub
		System.out.println("�Բ��𣬲�֧�ָò���");
		return null;
	}

	@Override
	public void deliverAnnouncement() {
		// TODO Auto-generated method stub
		System.out.println("----�ַ���"+name);
	}
}
