package defaultMethod;
/*
 Default Methods::
 
    1.  Methods that are declared using the default keyword inside the interface are known as default methods. 
    2.  These methods are non-abstract methods. 
    3.  We can have any number of default methods and abstract methods in an interface
    
   Why need:: 
    The reason behind adding the default method is to allowed us to add new methods to the interfaces without affecting the classes that implement these interfaces.
 
 Example::
 
     interface InfDemo{
     
	// Default method
	 
	 default void demo1() {
		 System.out.println("Default demo1 method inside interface");
	 }
}

 */

interface InfDemo{
	
	// Default method
	 default void demo1() {
		 System.out.println("Default demo1 method");	 
	 }
	 
	 default void demo2() {
		 System.out.println("Default demo2 method");
	 }
	 
	 
	 // Abstract methods
	 void demo3();
}



class ImplDemo implements InfDemo {
	
	@Override
	public void demo3() {
		
		System.out.println("Implement demo3 method");	
	}
}




 public class DefaultMethod {

	public static void main(String[] args) {
		
		System.out.println("--Interface Referrance--");
		
		InfDemo d1=new ImplDemo();
		
		// Calling Default Methods
		d1.demo1();
		d1.demo2();
		
		// Calling Abstract Methods
		d1.demo3();
		
		System.out.println("--Implementation Referrance--");
		
		ImplDemo d2=new ImplDemo();
		
		// Calling Default Methods
		d2.demo1();
		d2.demo2();
		
		// Calling Abstract Methods
		d2.demo3();

	}

}
