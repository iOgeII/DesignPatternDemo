package example._3Bridge_Adapter;

public abstract class Report {

	protected DataOutputFormat dof;
	
	public void setDof(DataOutputFormat dof) {
		this.dof = dof;
	}
	
	public abstract void displayReport();
}
