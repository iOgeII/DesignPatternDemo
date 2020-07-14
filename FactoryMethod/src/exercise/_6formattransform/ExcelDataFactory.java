package exercise._6formattransform;

public class ExcelDataFactory implements DataFactory {

	@Override
	public Data getData() {
		// TODO Auto-generated method stub
		return new ExcelData();
	}

}
