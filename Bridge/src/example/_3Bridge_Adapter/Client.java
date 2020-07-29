package example._3Bridge_Adapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataOutputFormat dof = new DataOutputFormatExcel();
		Report report = new ConcreteReportA();
		report.setDof(dof);
		report.displayReport();
	}

}
