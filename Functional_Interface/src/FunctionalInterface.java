/*
  Functional Interface: 
  1. A functional interface is a interface which contains SAM(Single Abstract Method (SAM) only one interface
  
  2. It may contains multiple default method and static method. it is optional.
  
  3. using "@FunctionalInterface" annotations we can make a interface as a strictly functional interfaces
  
  4. without "@FunctionalInterface" annotation a interface can be normal or can be functional interface.
     if one method is abstract method is there then it is a functional interface without using annotation
     
  5. @FunctionalInterface" annotation is optional but recommended.
  
  6. one  FunctionalInterface can extends another FunctionalInterface but child FunctionalInterface
    shouldn't have any abstract method. Otherwise it will give error. 
    
    
    
    why we need FunctionalInterface --
     
     *The functional interface is used to support the 
     
     a. functional programming approach
     b. lambda expression
     c. method reference .
     
     --------------------------------------------------------------
     
     Example: Functional Interface
 
 Example 1. Only one method(allowed-Functional Interface)
        
        public interface FunctionalInterface 
        {
	           public void demo();

         }
         
        
	      
 Example 2. Multiple method(allowed normal interface , not Functional Interface)
         
         public interface FunctionalInterface 
        {
	           public void demo();
	           public void demo1();

         }
	     
	      
	      	      
 Example 3. With @FunctionalInterface annotation (allowed-strictly Functional Interface)
        
        @FunctionalInterface
        public interface FunctionalInterface 
        {
	           public void demo();

         }
	
	      	      	      
 Example 4. Multiple method With @FunctionalInterface (error- Functional Interface)
        
        @FunctionalInterface
        public interface FunctionalInterface 
        {
	           public void demo();
	           public void demo1();

         }
	      	      	      	      
 Example 5. default method & static method With @FunctionalInterface (allowed- Functional Interface)
        
        @FunctionalInterface
        public interface FunctionalInterface 
        {
	           public void demo();
	           
	           default void defaultMethod()
	           {
	             System.out.println("Default Method"); // allowed
	           }
	           
	           static void staticMethod()
	           {
	             System.out.println("Static Method"); // allowed
	           }

         }
         
Example 6.child FunctionalInterface(had method) extends  parent FunctionalInterface (not allowed- Functional Interface)
        
        @FunctionalInterface
        public interface Parent 
        {
	           public void parentMethod();

         }
         
          @FunctionalInterface
        public interface child extends Parent 
        {
	           public void childMethod(); // cuz after extends child interface had  
	                                      // two abstract method   

         }


Example 7.child FunctionalInterface(no method) extends  parent FunctionalInterface (allowed- Functional Interface)
        
        @FunctionalInterface
        public interface Parent 
        {
	           public void parentMethod();

         }
         
          @FunctionalInterface
        public interface child extends Parent 
        {
	            // one abstract method is there which is coming from parent  
	                                       

         }
	
	
     
 
------------------------------------Normal Interface representation------------------------------
// Normal Interface to Functional Interface representation
 
 
 

interface InfDemo{
	
	public void demo(String s);	
}

class ImplDemo implements InfDemo{

	@Override
	public void demo(String s) {
		
		System.out.println(s+": Implementation of demo method");
	}
	
	/* lambda representation
	 
//	(s)-> { System.out.println(s+": Implementation of demo method"); }
	 
	 
	
}

public class FunctionalInterface {

	public static void main(String[] args) {
		
		System.out.println("--Welcome to Functional Interface--");
		
		ImplDemo demo1=new ImplDemo();
		demo1.demo("Implementation Object");
		
		InfDemo demo2=new ImplDemo();
		demo2.demo("Interface reference");

	}

}

------------------------------------Functional Interface Representation------------------------

*/

interface InfDemo{
	
	public void demo(String s);	
}

public class FunctionalInterface {

	public static void main(String[] args) {
		
		System.out.println("--Welcome to Functional Interface--");
		
		//no need separate implementation class
		
		InfDemo demo2=(s)-> { System.out.println(s+": Implementation of demo method"); }; //provide Implementation
		demo2.demo("Interface reference");

	}

}


