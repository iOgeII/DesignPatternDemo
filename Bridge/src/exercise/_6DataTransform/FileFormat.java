package exercise._6DataTransform;

public abstract class FileFormat {

	protected Database db;
	
	public void setDatabase(Database db) {
		this.db = db;
	}
	
	public abstract void transformData();
	
}
