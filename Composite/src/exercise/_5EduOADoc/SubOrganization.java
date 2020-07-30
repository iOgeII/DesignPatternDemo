package exercise._5EduOADoc;

import java.util.ArrayList;

public class SubOrganization extends Organization {
	
	private ArrayList<Organization> subOrganizationList = new ArrayList<Organization>();
	
	private String name;
	
	public SubOrganization(String name) {
		this.name = name;
	}

	@Override
	public void add(Organization o) {
		// TODO Auto-generated method stub
		subOrganizationList.add(o);
	}

	@Override
	public void remove(Organization o) {
		// TODO Auto-generated method stub
		subOrganizationList.remove(o);
	}

	@Override
	public Organization getChild(int i) {
		// TODO Auto-generated method stub
		return subOrganizationList.get(i);
	}

	@Override
	public void deliverAnnouncement() {
		System.out.println("++公文发送至"+name);
		// TODO Auto-generated method stub
		for(Object obj:subOrganizationList) {
			((Organization)obj).deliverAnnouncement();
		}
	}

}
