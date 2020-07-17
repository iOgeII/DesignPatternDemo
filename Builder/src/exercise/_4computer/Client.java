package exercise._4computer;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerBuilder cb = (ComputerBuilder)XMLUtil.getBean();
		
		ComputerDirector cd = new ComputerDirector();
		Computer computer;
		computer = cd.construct(cb);
		
		System.out.println(computer.getCPU());
		System.out.println(computer.getMemory());
		System.out.println(computer.getHardware());
		System.out.println(computer.getHost());
		System.out.println(computer.getDisplay());	
	}

}
