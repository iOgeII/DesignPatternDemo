package example._2charts;

/**
 * 简单工厂模式中的 Factory
 * @author 香南鹤砚
 *
 */
public class ChartFactory {
	
	public static Chart getChart(String type) {
		Chart chart;
		if(type.equalsIgnoreCase("histogram")) {
			chart = new HistogramChart();
			System.out.println("初始化设置柱状图。");
		}
		else if(type.equalsIgnoreCase("pie")) {
			chart = new PieChart();
			System.out.println("初始化设置饼图。");
		}
		else if(type.equalsIgnoreCase("line")) {
			chart = new LineChart();
			System.out.println("初始化设置折线图。");
		}
		else {
			chart = null;
		}
		return chart;
	}

}
