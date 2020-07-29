package exercise._5PlaneProducer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plane plane = new PassengerPlane();
		PlaneProducer producer = new McDonnellDouglas();
		producer.setPlane(plane);
		producer.producePlane();
		
		plane = new CargoPlane();
		producer = new Boeing();
		producer.setPlane(plane);
		producer.producePlane();
	}

}
