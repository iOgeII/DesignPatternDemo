package exercise._4BriefReport;

public class RawDataReportFacade extends ReportFacade {

	private DataReader dr;
	private Data2XML dxml;
	private DataStatistics ds;
	private Report report;
	
	public RawDataReportFacade() {
		// TODO Auto-generated constructor stub
		dr = new DataReader();
		dxml = new Data2XML();
		ds = new DataStatistics();
		report = new Report();
	}
	
	@Override
	public void getReport() {
		// TODO Auto-generated method stub
		System.out.println("[数据格式]其他");
		dr.readData();
		dxml.data2XML();
		ds.dataStatistics();
		report.displayReport();
	}

}
