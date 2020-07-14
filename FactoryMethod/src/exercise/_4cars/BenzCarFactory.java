package exercise._4cars;

public class BenzCarFactory implements CarFactory {

	@Override
	public Car produceCar() {
		// TODO Auto-generated method stub
		return new BenzCar();
	}

}
