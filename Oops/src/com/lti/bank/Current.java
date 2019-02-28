package com.lti.bank;

public class Current extends Account {
	public double overdraft;

	public Current() {
		
	}

	public Current( String holder) {
		super( holder, INIT_CUR_BAL);
		this.overdraft=OD_LIMIT;
		
	}

	@Override
	public void summary() {
		
		super.summary();
		System.out.println("overdraft"+overdraft);
	}

	@Override
	public void deposit(double amount) {
		overdraft+= amount;
		if(overdraft>OD_LIMIT) {
			balance+=(overdraft-OD_LIMIT);
			overdraft=OD_LIMIT;
		}
	}

	@Override
	public void withdraw(double amount) {
		if (amount<=(overdraft+balance)) {
			balance-=amount;
			if(balance<0) {
				overdraft+= amount;
				balance=0;
			}
			else
				System.out.println("insufficient funds");
		}
		
	}
	

}
