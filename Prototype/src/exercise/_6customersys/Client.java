package exercise._6customersys;

public class Client {

	public static void main(String[] args) {
		
		Address add = new Address();
		add.setCountry("China");
		Customer c = new Customer();
		c.setName("test");
		c.setAddress(add);
		Customer copy = c.clone();
		System.out.println("Դ�ͻ������븴�ƿͻ�������ͬ��"+(c == copy));
		System.out.println("Դ�ͻ���ַ�븴�ƿͻ���ַ��ͬ��"+(c.getAddress() == copy.getAddress()));
		
	}
}
