package exercise._4nvwa;

public class ClientController {
	
	public static void main(String[] args) {
		Person p;
		p = Nvwa.createPerson("W");
		p.displayInfo();
		
		p = Nvwa.createPerson("M");
		p.displayInfo();
		
		p = Nvwa.createPerson("R");
		p.displayInfo();
		
	}
}
