package example._2SupplyChainManage;

public class President extends Approver {

	public President(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub
		if(request.getAmount() < 500000) {
			// ��������
			System.out.println("���³�"+this.name+"�����ɹ�����"+request.getNumber()+"����"+request.getAmount()+"Ԫ���ɹ�Ŀ�ģ�"+request.getPurpose()+".");
		}
		else {
			// ת������
			this.successor.processRequest(request);
		}
	}

}
