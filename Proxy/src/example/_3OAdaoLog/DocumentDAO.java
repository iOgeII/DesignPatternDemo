package example._3OAdaoLog;

public class DocumentDAO implements AbstractDocumentDAO {

	@Override
	public Boolean deleteDocumentById(String documentId) {
		// TODO Auto-generated method stub
		if(documentId.equalsIgnoreCase("D001")) {
			System.out.println("ɾ��IDΪ"+documentId+"���ĵ���Ϣ�ɹ���");
			return true;
		}
		else {
			System.out.println("ɾ��IDΪ"+documentId+"���ĵ���Ϣʧ�ܣ�");
			return false;
		}
	}
	

}
