package exercise._5PlaneProducer;

public abstract class PlaneProducer {

	protected Plane plane;
	
	public void setPlane(Plane plane) {
		this.plane = plane;
	}
	
	public abstract void producePlane();
}
