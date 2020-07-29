package example._3Bridge_Adapter;

public class ConcreteReportB extends Report {

	@Override
	public void displayReport() {
		// TODO Auto-generated method stub
		System.out.println("Displaying report B.");
		dof.dataOutput();
	}

}
