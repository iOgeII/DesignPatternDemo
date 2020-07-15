package exercise._6gameapp;

public class iOSSmartphoneOS implements SmartphoneOS {

	@Override
	public OperationController initOperationController() {
		// TODO Auto-generated method stub
		return new iOSOperationController();
	}

	@Override
	public InterfaceController initInterfaceController() {
		// TODO Auto-generated method stub
		return new iOSInterfaceController();
	}

}
