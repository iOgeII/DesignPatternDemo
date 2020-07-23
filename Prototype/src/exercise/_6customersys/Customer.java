package exercise._6customersys;

public class Customer implements Cloneable {

	private String name;
	private String email;
	private String sex;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Customer clone() {
		Customer c = null;
		try {
			c = (Customer) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("不支持复制！");
		}
		return c;
	}
}
