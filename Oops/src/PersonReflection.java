import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonReflection {

	public static void main(String[] args) {
		Person p = new Person("polo", 21);
		Class pc = p.getClass(); // returns all the info of the class
		System.out.println(pc.getName());
		Constructor[] constructors = pc.getConstructors();
		System.out.println("--list of constructors");
		for (Constructor constructor : constructors)
			System.out.println(constructor);
		Method[] methods = pc.getMethods();
		System.out.println("--list of methods");
		for (Method method : methods)
			System.out.println(method);

		Method[] decMethods = pc.getDeclaredMethods();
		System.out.println("--list of declared methods");
		for (Method method : decMethods)
			System.out.println(method);
		
		Field[] fields=pc.getFields();
		System.out.println("--list of fields");
		for(Field field:fields)
			System.out.println(field);
	

	}

}
