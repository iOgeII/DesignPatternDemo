package example._2SupplyChainManage;

public class Manager extends Approver {

	public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub
		if(request.getAmount() < 80000) {
			// ��������
			System.out.println("����"+this.name+"�����ɹ�����"+request.getNumber()+"����"+request.getAmount()+"Ԫ���ɹ�Ŀ�ģ�"+request.getPurpose()+".");
		}
		else {
			// ת������
			this.successor.processRequest(request);
		}
	}

}
