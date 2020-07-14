package exercise._6formattransform;

public class DatabaseDataFactory implements DataFactory {

	@Override
	public Data getData() {
		// TODO Auto-generated method stub
		return new DatabaseData();
	}

}
