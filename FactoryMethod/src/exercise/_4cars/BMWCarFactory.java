package exercise._4cars;

public class BMWCarFactory implements CarFactory {

	@Override
	public Car produceCar() {
		// TODO Auto-generated method stub
		return new BMWCar();
	}

}
