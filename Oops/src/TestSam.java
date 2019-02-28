
public class TestSam {
 public void testHello() {
	 Hello h=(name)->"hello"+name;
	 System.out.println(h.sayHello("zubair"));
	 System.out.println(h.sayBye("zubair"));
 }
	public static void main(String[] args) {
 TestSam sam= new TestSam();
 sam.testHello();
System.out.println(Hello.max(10, 20));
	}
	
	
}
