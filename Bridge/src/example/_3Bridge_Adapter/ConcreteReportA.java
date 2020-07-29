package example._3Bridge_Adapter;

public class ConcreteReportA extends Report {

	@Override
	public void displayReport() {
		// TODO Auto-generated method stub
		System.out.println("Displaying report A.");
		dof.dataOutput();
	}

}
