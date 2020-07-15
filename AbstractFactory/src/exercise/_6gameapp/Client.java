package exercise._6gameapp;

public class Client {

	public static void main(String[] args) {
		SmartphoneOS os;
		OperationController oc;
		InterfaceController ic;
		
		os = (SmartphoneOS)XMLUtil.getBean();
		oc = os.initOperationController();
		ic = os.initInterfaceController();
		
		oc.OpRun();
		ic.fullScreen();
	}
}
