
public class Customer {
	private int cust_id;
	private String cust_name;
	private double creditlimit;

	public Customer() {

	}

	public Customer(int cust_id, String cust_name, double creditlimit) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.creditlimit = creditlimit;
	}

	public void showdata() {
		System.out.println("CUST No:" + cust_id);
		System.out.println("CUSTName:" + cust_name);
		System.out.println("CREDIT:" + creditlimit);

	}
}
