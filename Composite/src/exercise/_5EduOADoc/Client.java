package exercise._5EduOADoc;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Organization sub1,sub2,sub3,sub4;
		Organization office1,office2,office3,office4,office5,office6,office7,office8;
		
		sub1 = new SubOrganization("北京总部");
		sub2 = new SubOrganization("湖南分校");
		sub3 = new SubOrganization("长沙教学点");
		sub4 = new SubOrganization("湘潭教学点");
		
		office1 = new Office("教务办公室");
		office2 = new Office("行政办公室");
		office3 = new Office("教务办公室");
		office4 = new Office("行政办公室");
		office5 = new Office("教务办公室");
		office6 = new Office("行政办公室");
		office7 = new Office("教务办公室");
		office8 = new Office("行政办公室");
		
		sub1.add(office1);
		sub1.add(office2);
		sub1.add(sub2);
		
		sub2.add(office3);
		sub2.add(office4);
		sub2.add(sub3);
		sub2.add(sub4);
		
		sub3.add(office5);
		sub3.add(office6);
		
		sub4.add(office7);
		sub4.add(office8);
		
		sub1.deliverAnnouncement();
		
	}

}
