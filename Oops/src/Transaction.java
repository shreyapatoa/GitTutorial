
public class Transaction {   //to create an array of transaction type
	private String type;
	private double amount, balance;

	public Transaction() {
	}

	public Transaction(String type, double amount, double balance) {

		this.type = type;
		this.amount = amount;
		this.balance = balance;

	}

	public void print() {
		System.out.println(type + "\t" + amount + "\t" + balance);
	}
}
