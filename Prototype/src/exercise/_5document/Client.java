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
		
		System.out.println("["+documentType+"]源文档："+doc.getTitle());
		System.out.println("["+documentType+"]备份文档："+docCopy.getTitle());
		doc.download();
		docCopy.download();
	}

}
