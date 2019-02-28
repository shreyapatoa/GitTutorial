 package com.lti.bank;
 

public abstract class Account implements Bank { // ABSTRACT METHOD IS DEFINED SO CLASS MUST BE ABSTRACT.

	private int acntNo;
	private String holder;
	protected double balance;
	// constants
	// public static final int INIT_ACNT_NO=12001;
	// public static final int INIT_CUR_BAL=5000;
	// public static final int MIN_CUR_BAL=0;
	// public static final int MIN_SAV_BAL=1000;
	// public static final int OD_LIMIT=10000;
	private static int autogen = INIT_ACNT_NO;

	protected Transaction[] txns; //
	protected int indx; // to loop till 10 transactions

	public Account() { // DEFAULT CONSTRUCTER

	}

	public Account(String holder, double balance) { // PARAMETERIZED CONSTRUCTER
		super();
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;
	}

	public void summary() {
		System.out.println("acntNo" + acntNo);
		System.out.println("holder" + holder);
		System.out.println("balance" + balance);

	}

	// BL Methods

	public void deposit(double amount) {
		balance += amount;
		txns[indx++] = new Transaction("CR", amount, balance);

	}

	public void statement() {
		System.out.println("Transaction of the account is:-" + acntNo);
		for (int i = 0; i < indx; i++)
			txns[i].print();

	}

	public abstract void withdraw(double amount); // ABSTRACT METHOD SO THAT OTHER SUB CLASSES CAN DEFINE THEIR OWN
													// METHODS ACCORDINGLY

}
