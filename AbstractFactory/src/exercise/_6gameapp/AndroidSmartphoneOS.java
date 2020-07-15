package exercise._6gameapp;

public class AndroidSmartphoneOS implements SmartphoneOS {

	@Override
	public OperationController initOperationController() {
		// TODO Auto-generated method stub
		return new AndroidOperationController();
	}

	@Override
	public InterfaceController initInterfaceController() {
		// TODO Auto-generated method stub
		return new AndroidInterfaceController();
	}

}
