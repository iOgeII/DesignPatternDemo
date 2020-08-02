package exercise._5MethodLogger;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoggerProxy logger = new LoggerProxy(new RealSubject());
		
		logger.method();
	}

}
