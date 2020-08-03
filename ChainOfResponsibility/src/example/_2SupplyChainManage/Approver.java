package example._2SupplyChainManage;

public abstract class Approver {

	// �����̶���
	protected Approver successor;
	// ��������������
	protected String name;
	
	public Approver(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	// ���ú����
	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}
	
	// ������������
	public abstract void processRequest(PurchaseRequest request);
}
