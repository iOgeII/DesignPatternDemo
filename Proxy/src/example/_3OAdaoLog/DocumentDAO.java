package example._3OAdaoLog;

public class DocumentDAO implements AbstractDocumentDAO {

	@Override
	public Boolean deleteDocumentById(String documentId) {
		// TODO Auto-generated method stub
		if(documentId.equalsIgnoreCase("D001")) {
			System.out.println("删除ID为"+documentId+"的文档信息成功！");
			return true;
		}
		else {
			System.out.println("删除ID为"+documentId+"的文档信息失败！");
			return false;
		}
	}
	

}
