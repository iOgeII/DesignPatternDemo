package example._3Bridge_Adapter;

public class DataOutputFormatExcel extends DataOutputFormat {

	private ExcelAPI excelApi = new ExcelAPI();
	
	@Override
	public void dataOutput() {
		// TODO Auto-generated method stub
		this.excelApi.dataOutput2Excel();
	}

}
