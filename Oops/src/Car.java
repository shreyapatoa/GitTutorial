
public class Car {
private String model;
private String[]features;



public Car(String model, String...features) {
	this.model = model;
	this.features = features;
}
 public void specs() {
	 System.out.println("feature s of "+model);
	 for(String feature : features)
		 System.out.println(feature);
 }
 public static void main(String[] args) {
	//String []falto = {"keyless entry","power saving","power window"};
	Car alto = new Car ("Suzuki alto ","keyless entry","power saving","power window");
	//String [] fbal= {"keyless","abs","pano roof","airbridge","cruise control"};
	Car baleno= new Car ("suzuki baleno","keyless","abs","pano roof","airbridge","cruise control");
	alto.specs();
	baleno.specs();
	}

 }

