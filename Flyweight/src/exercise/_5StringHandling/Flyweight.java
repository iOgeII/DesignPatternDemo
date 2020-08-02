package exercise._5StringHandling;

public abstract class Flyweight {

	public abstract String getStr();
	
	public void stringStyle(Style s) {
		System.out.println("×Ö·û´®£º"+this.getStr()+"£¬ÑÕÉ«£º"+s.getColor()+"£¬´óÐ¡"+s.getFont());
	}
}
