package exercise._6customersys;

public class Client {

	public static void main(String[] args) {
		
		Address add = new Address();
		add.setCountry("China");
		Customer c = new Customer();
		c.setName("test");
		c.setAddress(add);
		Customer copy = c.clone();
		System.out.println("源客户档案与复制客户档案相同吗："+(c == copy));
		System.out.println("源客户地址与复制客户地址相同吗："+(c.getAddress() == copy.getAddress()));
		
	}
}
