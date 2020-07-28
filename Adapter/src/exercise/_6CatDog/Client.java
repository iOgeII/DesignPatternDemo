package exercise._6CatDog;

public class Client {

	public static void main(String[] args) {
		ShorthairCat shCat = new ShorthairCat();
		DobermanDog dbDog = new DobermanDog();
		Adapter adapter;
		adapter = new Adapter(shCat, dbDog);
		
		shCat.catInfo();
		adapter.catchMouse();
		
		dbDog.dogInfo();
		adapter.bark();
	}
}
