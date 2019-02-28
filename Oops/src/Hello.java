
public interface Hello {
	String sayHello(String name); //this interface can have only one single method or sam single abstract method 
   	
default String sayBye(String name) {
	return "bye"+name;
}
 static int  max(int a,int b) {
	return a>b?a:b;
}
 String toString();

}
