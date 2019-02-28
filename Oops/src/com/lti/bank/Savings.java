package com.lti.bank;

public class Savings extends Account {

	public Savings() {

	}

	public Savings(String holder) {
		super(holder, MIN_SAV_BAL);
		txns = new Transaction[10]; // creates 10 refrences of transaction type
		Transaction t = new Transaction("CR", MIN_SAV_BAL, MIN_SAV_BAL);
		txns[indx] = t;
		indx++;
	}

	@Override
	public void withdraw(double amount) {
		if (amount <= (balance - MIN_SAV_BAL)) {
			balance -= amount;
			txns[indx++] = new Transaction("DR", amount, balance);
		} else
			System.out.println("insufficient funds");

	}

}
