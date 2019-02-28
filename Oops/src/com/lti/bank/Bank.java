package com.lti.bank;

public interface Bank {
void summary();
void deposit(double amount);
void withdraw(double amount);
void statement();
//constants
public static final int INIT_ACNT_NO=12001;
public static final int INIT_CUR_BAL=5000;
public static final int MIN_CUR_BAL=0;
public static final int MIN_SAV_BAL=1000;
public static final int OD_LIMIT=10000;
public static final int autogen=INIT_ACNT_NO;
}
