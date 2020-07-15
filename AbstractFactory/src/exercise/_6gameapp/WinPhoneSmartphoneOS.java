package exercise._6gameapp;

public class WinPhoneSmartphoneOS implements SmartphoneOS {

	@Override
	public OperationController initOperationController() {
		// TODO Auto-generated method stub
		return new WinPhoneOperationController();
	}

	@Override
	public InterfaceController initInterfaceController() {
		// TODO Auto-generated method stub
		return new WinPhoneInterfaceController();
	}

}
