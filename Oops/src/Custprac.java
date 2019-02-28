
public class Custprac 
{
private int customer_id;
private String custname;
private int credit_lim;

public Custprac()
{
	
}

public Custprac(int customer_id, String custname, int credit_lim) {
	super();
	this.customer_id = customer_id;
	this.custname = custname;
	this.credit_lim = credit_lim;
}

public void showdata()
{
System.out.println("customer_id"+customer_id);
System.out.println("custname"+custname);
System.out.println("credit_lim"+credit_lim);
}	
}

	

