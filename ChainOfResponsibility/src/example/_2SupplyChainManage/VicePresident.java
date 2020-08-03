package example._2SupplyChainManage;

public class VicePresident extends Approver {

	public VicePresident(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub
		if(request.getAmount() < 100000) {
			// 处理请求
			System.out.println("副董事长"+this.name+"审批采购单："+request.getNumber()+"，金额："+request.getAmount()+"元，采购目的："+request.getPurpose()+".");
		}
		else {
			// 转发请求
			this.successor.processRequest(request);
		}
	}

}
