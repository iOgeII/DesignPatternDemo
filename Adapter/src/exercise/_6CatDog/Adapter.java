package exercise._6CatDog;

public class Adapter implements Cat, Dog {

	private Cat cat;
	private Dog dog;
	
	public Adapter(Cat cat) {
		this.cat = cat;
	}
	
	public Adapter(Dog dog) {
		this.dog = dog;
	}
	
	public Adapter(Cat cat, Dog dog) {
		this.cat = cat;
		this.dog = dog;
	}
	
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		cat.catchMouse();
	}

	@Override
	public void catchMouse() {
		// TODO Auto-generated method stub
		dog.bark();
	}

}
