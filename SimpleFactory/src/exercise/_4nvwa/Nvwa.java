package exercise._4nvwa;

public class Nvwa {
	
	public static Person createPerson(String type) {
		if(type.equalsIgnoreCase("M")) {
			return new Man();
		}
		else if(type.equalsIgnoreCase("W")) {
			return new Woman();
		}
		
		// 更新的女娲造机器人
		else if(type.equalsIgnoreCase("R")) {
			return new Robot();
		}
		
		else {
			return null;
		}
	}

}
