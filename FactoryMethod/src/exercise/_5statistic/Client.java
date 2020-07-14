package exercise._5statistic;

public class Client {

	public static void main(String[] args) {
		
		ChartFactory cFactory;
		Chart chart;
		cFactory = new HistogramChartFactory();
		chart = cFactory.createChart();
		chart.chartInfo();
		
	}
}
