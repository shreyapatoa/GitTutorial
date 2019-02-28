import com.lti.emp.Employee;
import com.lti.emp.Executive;
import com.lti.emp.Manager;

public class TestEmployee {

	public static void main(String[] args) {
		
		Executive exe = new Executive("Lilli", 6500, 2000);
		
		Manager mgr = new Manager("Jack", 8500, 2000);
		showSalary(exe);
		showSalary(mgr);
	}
		 private static void showSalary(Employee e) {
			 if(e instanceof Manager)
				 System.out.println("manager salary"+e.getSalary());
			 else
				 System.out.println("executive salary"+e.getSalary());
			e.payslip();
		 }
}
