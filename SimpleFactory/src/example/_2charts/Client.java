package example._2charts;

public class Client {

	// 1.δʹ��xml����
//	public static void main(String[] args) {
//		Chart chart;
//		chart = ChartFactory.getChart("Pie");
//		chart.display();
//	}
	
	// 2.ʹ��xml����
	public static void main(String[] args) {
		Chart chart;
		String type = XMLUtil.getChartType();
		chart = ChartFactory.getChart(type);
		chart.display();
	}
}
