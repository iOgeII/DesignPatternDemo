package exercise._5document;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String documentType = XMLUtil.getDocType();
		DocumentManager dm = new DocumentManager();
		Document doc = dm.get(documentType);
		doc.setTitle("backup document");
		Document docCopy = doc.Clone();
		doc.setTitle("original document");
		
		System.out.println("["+documentType+"]Դ�ĵ���"+doc.getTitle());
		System.out.println("["+documentType+"]�����ĵ���"+docCopy.getTitle());
		doc.download();
		docCopy.download();
	}

}
