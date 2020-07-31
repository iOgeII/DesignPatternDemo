package exercise._4BriefReport;

public class XMLReportFacade extends ReportFacade {

	private DataReader dr;
	private DataStatistics ds;
	private Report report;
	
	public XMLReportFacade() {
		// TODO Auto-generated constructor stub
		dr = new DataReader();
		ds = new DataStatistics();
		report = new Report();
	}
	
	@Override
	public void getReport() {
		// TODO Auto-generated method stub
		System.out.println("[数据格式]XML");
		dr.readData();
		ds.dataStatistics();
		report.displayReport();
	}

}
