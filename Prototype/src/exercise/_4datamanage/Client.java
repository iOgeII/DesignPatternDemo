 package exercise._4datamanage;

public class Client {

	public static void main(String[] args) {
		DataChart chart = new DataChart();
		DataSet dataSet = new DataSet();
		dataSet.setName("dataA");
		chart.setDataSet(dataSet);
		DataChart cloneChart = chart.deepClone();
		dataSet.setName("dataB");
		chart.setDataSet(dataSet);
		
		System.out.println("Դ����ͼ��"+chart.getDataSet().getName());
		System.out.println("��¡����ͼ��"+cloneChart.getDataSet().getName());
	}
}
