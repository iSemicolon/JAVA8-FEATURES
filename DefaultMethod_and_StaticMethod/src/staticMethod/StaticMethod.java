package staticMethod;

/*
 
 Static Methods::
 
         1.Like default methods, interface allows adding static methods inside it. 
         
         2.We can define static methods inside the interface using the static keyword and are used to define utility methods.
         
         3.We can have any number of static methods in the interface. 
         
         4.From Java 8, An interface can contain default, static, abstract and non-abstract methods.

Example:: 

interface InfDemo{

	// Static method
	 
	 static void demo() {
	 
		 System.out.println("Static Method inside interface");
	 }
}

 */



interface InfDemo{
	
	
	// Static method
	static void demo1() {
		 System.out.println("Static demo1 method");	 
	 }
	 
	static void demo2() {
		 System.out.println("Static demo2 method");	 
	 }
	
	 // Default Method
	 default void demo3() {
		 System.out.println("Default demo3 method");
	 }
	 
	 // Abstract Method
	 void demo();
}



 class ImplDemo implements InfDemo {

	public void getInfo() {
		System.out.println("This is new style Java 8 Interface");
	}
	
	
	@Override
	public void demo() {
		System.out.println("Implementation demo method");
		
	}

}

public class StaticMethod {

	public static void main(String[] args) {
		

      System.out.println("--Interface Referrance --");
		
		InfDemo d1=new ImplDemo();
		
//		// Calling Static Methods using interface reference  --not allowed
//		d1.demo1();
//		d1.demo2(); 
		
	// Calling Static Methods using interface name --only allowed
		InfDemo.demo1();
		InfDemo.demo2(); 
		
	
		// Calling default Methods using interface reference --allowed
		d1.demo3();
	
			
		// Calling Abstract Methods using interface reference --allowed
		d1.demo();
		
		
		
		System.out.println("--Implementation Referrance--");
		
		ImplDemo d2=new ImplDemo();
		
		
//		// Calling Static Methods using Implementation reference  --not allowed
//		d2.demo1();
//		d2.demo2(); 
		
		
	
		// Calling default Methods using interface reference --allowed
		d2.demo3();
	
			
		// Calling Abstract Methods using interface reference --allowed
		d2.demo();
	}

}
