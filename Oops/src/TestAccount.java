import com.lti.bank.BalanceException;
import com.lti.bank.Savings;

public class TestAccount {

	public static void main(String[] args) {
		Savings s= new Savings("polo");

	try {
		s.withdraw(1500);
	}
	catch(BalanceException e) {
	
e.printStackTrace();     //defined for developers to troubleshoot problems	
	System.out.println(e); //login [System Audit]
	System.out.println(e.getMessage());} // End Users
	
	}
	}
