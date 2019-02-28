package com.lti.emp;
//abstract class
public abstract class Employee {

	private int empNo;
	private String empName;
	private double salary;
	//static keyword
	private static int autogen;
	static {
		System.out.println("class employee loaded");
		autogen=1001;
	}

	public Employee() {
	}
//employeee constructor
	public Employee(String empName, double salary) {
		super();
		this.empNo = autogen++;
		this.empName = empName;
		this.salary = salary;

	}
	//payslip of employee

	public void payslip() {
		System.out.println("Emp No:" + empNo);
		System.out.println("Emp Name:" + empName);
		System.out.println("salary:" + salary);

	}

	public double getSalary() {
		return salary;
	}

}
