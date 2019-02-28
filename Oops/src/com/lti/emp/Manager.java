package com.lti.emp;
public class Manager extends Employee {
private int bonus;

public Manager() {
	
	
}

public Manager(String empName, double salary, int bonus) {
	super(empName, salary);
	this.bonus=bonus;
	
}

@Override
public void payslip() {
	
	super.payslip();
	System.out.println("Salary of the manager is"+getSalary()+bonus);
	System.out.println("bonus of manager is"
			+ ""
			+ ""+bonus);
}

@Override
public double getSalary() {
	
	return super.getSalary()+bonus;
}




}
