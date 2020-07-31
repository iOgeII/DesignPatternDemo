package exercise._4BriefReport;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReportFacade rf = new RawDataReportFacade();
		rf.getReport();
		
		System.out.println("-------------");
		
		rf = new XMLReportFacade();
		rf.getReport();
	}

}
