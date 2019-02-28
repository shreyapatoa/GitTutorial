package com.lti.bank;
public final class AccountFactory {                                        // this is stateless type class
	public static Bank openAccount(String holder, String type) {
		Bank acnt = null;
		if (type.equalsIgnoreCase("savings"))
			acnt = new Savings(holder);
		else
			acnt = new Current(holder);
		return acnt;

	}
}
