package example._2SupplyChainManage;

public class Congress extends Approver {

	public Congress(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub
		// ��������
		System.out.println("�ٿ����»������ɹ�����"+request.getNumber()+"����"+request.getAmount()+"Ԫ���ɹ�Ŀ�ģ�"+request.getPurpose()+".");
	}

}
