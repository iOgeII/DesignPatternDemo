package example._2SupplyChainManage;

public class Congress extends Approver {

	public Congress(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub
		// 处理请求
		System.out.println("召开董事会审批采购单："+request.getNumber()+"，金额："+request.getAmount()+"元，采购目的："+request.getPurpose()+".");
	}

}
