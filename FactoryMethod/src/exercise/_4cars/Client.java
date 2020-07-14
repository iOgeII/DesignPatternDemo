package exercise._4cars;

public class Client {

	public static void main(String[] args) {

		CarFactory carFactory;
		Car car;
		carFactory = new BMWCarFactory();
		car = carFactory.produceCar();
		car.carInfo();
	}
}
