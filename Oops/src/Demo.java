
public class Demo {
private Object data;
public Demo(Object data)

{
	this.data=data;
}
public Object getData(){
	return data;
}
public void setData(Object data) {
	this.data = data;
}
public static void main(String[] args) {
	Demo d1=new Demo("hello");
	d1.setData(1.345);
	System.out.println(d1.getData());
	
	Demo d2=new Demo(123);
	d2.setData("hola");
	System.out.println(d2.getData());
}
}
