/*
 Java8 purpose:
 1. To simplify programming
 2. To Utilize Functional Programming benefits
 3. To enable parallel programming to run on multi-core processors
 
 Features of Java8
 1. Lambda Expressions
 2. Functional Interfaces
 3. Default Methods in interfaces
 4. Static Methods in interfaces
 5. Predefined Functional Interfaces(Predicate, Function, Consumer, Supplier)
 5. Method references & consumer references by double(::) operators
 6. Stream API
 7. Date & Time API
 
 */

/* Lambda Expressions:
  
  what ??
       It is an anonymous function. it achieved by using arrow(->) symbol
       anonymous means
             1. no name
             2. no return type
             3. no modifiers
             4. curly braces are optional
             
  why need ??
       1. To enable Functional Programming
       2. write code more readable, maintainable & concise code   
       3. To use API very easily & effectively
       4. Enable parallel Processing
       
   limitations: it is limited for lambda expressions only. if functional interface not present we can't provide lamda expresions    
   
       Rules for return type:
               1. when one line no need curly braces
               2. If we use curly braces we have to put semicolon after line & after braces as well
               3. If we use return keyword mandatorily we have to use curly braces and semicolon
               4. If we don't use return keyword strictly curly braces and semicolon should not be there
               
               
               
 Example: without lambda expressions vs With lambda expressions
 
 Example 1. No parameter
         without lambda expressions::
         
         public void demo() {
		
         System.out.println("Hello World");
	     }
	     
	     
	      with lambda expressions::
	      
	      ()->System.out.println("Hello World");  // no name, no return type, no modifiers
	      
	      
 Example 2. No parameter
         without lambda expressions::
         
         public void demo() {
		
         System.out.println("Hello");
         System.out.println("World");
         
	     }
	     
	     
	      with lambda expressions::
	      
	      ()->{ System.out.println("Hello"); // for multiple line we need curly braces
	            System.out.println("World");
	          };
	      
	      	      
 Example 3. with parameter
         without lambda expressions::
         
         public void demo(int a, int b) {
		
         System.out.println(a+b);
         
	     }
	     
	     
	      with lambda expressions::
	      
	      (int a, int b)->System.out.println(a+b); // allowed
	      (a,b)->System.out.println(a+b);          //it also allowed. here jvm automatically detect the type 
	      
	
	      	      	      
 Example 4. with return type
         without lambda expressions::
         
         public int squareDemo(int a) {
		
         return a*a;
         
	     }
	     
	     
	      with lambda expressions::
	      
	      (int a)->{ return a*a;}; // allowed
	      (a)->{ return a*a;};     // allowed
	      (a)->{ return a*a};     // not allowed . semicolon missing
	      (a)->{a*a; };           // not allowed
	      (a)->a*a;               // allowed
	      
	      
	      
	      	      	      	      
 Example 5. with return type
         without lambda expressions::
         
         public int lengthDemo(String s) {
		
         return s.length();
         
	     }
	     
	     
	      with lambda expressions::
	      
	      (s)->{ return s.length();};    // allowed
	      (s)->{ return s.length();};     // allowed
	      (s)->{ return s.length()};     // not allowed . semicolon missing
	      (s)->{s.length(); };           // not allowed
	      (s)->s.length();               // allowed
	      
	      
	      
	      
	      
	     
	     
                 
 
 */

public class LambdaExpression {

	public static void main(String[] args) {

		System.out.println("Welcome to Lambda Expressions");
	}

}
