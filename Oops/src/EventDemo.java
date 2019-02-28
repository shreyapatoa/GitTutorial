
public class EventDemo implements Event {

	public void doSomething() {
		System.out.println("First implementation");

	}

	static class EventImpl implements Event {

		@Override
		public void doSomething() {
			System.out.println("second implementation");

		}

	}
	public void secondEvent() {
		Event e= new EventImpl();
		e.doSomething();
	}
	public void thirdEvent() {
		class InnerEvent implements Event{
			public void doSomething() {
				System.out.println("Third implementation");
			}
		}
		
		Event e = new InnerEvent();
		e.doSomething();
	}
     public void oneMoreEvent() {
    	 Event e = new Event() {
    		 public void doSomething() {
    			 System.out.println("forth implimentation");
    		 }
    	 };
    	 e.doSomething();
     }
     public void oneLastEvent() {                                                     //lamda expression new feature java8.
    	 Event e=()->{System.out.println("fifth implimentation ");};
    	 e.doSomething();
     }
	public static void main(String[] args) {
		EventDemo demo = new EventDemo();
		demo.doSomething();
		
		demo.secondEvent();;
		demo.thirdEvent();
		demo.oneMoreEvent();
		demo.oneLastEvent();
		//EventImpl impl= demo.new EventImpl();
		//impl.doSomething();

	}
}
