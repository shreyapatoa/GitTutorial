
public class Person {
	private String name;
	private int age;
	// default constructor
	public Person() {
	// Constructor chaining- calls another constructor on the same object with matching signature
		this("Anonymous",-1);     //In order to avoid duplication of code
	}

	// Parameterized constructor
	public Person(String pname, int page) {
		name = pname;
		age = page;
	}

	public void print() {
		System.out.println("Name:" + name + "\tAge:" + age);
		
	}

	@Override
	public String toString() {

		return"Name:" + name + "\tAge:" + age;
	}
public void finalize() throws Throwable{
	System.out.println("person is no more");
}
	
	}
    
	

	//
