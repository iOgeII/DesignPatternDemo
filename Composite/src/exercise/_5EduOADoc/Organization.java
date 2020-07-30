package exercise._5EduOADoc;

public abstract class Organization {

	public abstract void add(Organization o);
	
	public abstract void remove(Organization o);
	
	public abstract Organization getChild(int i);
	
	public abstract void deliverAnnouncement();
}
