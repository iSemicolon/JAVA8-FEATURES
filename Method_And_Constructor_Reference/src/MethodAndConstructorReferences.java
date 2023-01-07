/*
 MethodReferences::
          -alternative of lambda expression


 Advantages:: 
          -code reusability
          -reusing of existing method
          -when implementation needed we should go for lambda expression
          -when implementation available we should go for method references for reusing
          -when method return something we should go for constructor references      

 Types of method references::
                  There are 3 types of method references in java

                  1. Reference to a static method.
                         Syntax-    Class-name :: Method-name;

                  2. Reference to an instance method.
                         Syntax-    Instance-name :: Method-name;

                  3. Reference to a constructor.
                         Syntax-    Class-Name :: new;

 Example::
     A.To refer to a method in an object 
       Object :: methodName 

     B. lambda expression::

       To print all elements in a list
       a lambda expression that just calls a single method in its entire execution. 

       list.forEach(s -> System.out.println(s));  

     C. method reference::

       Shorthand to print all elements in a list 
       To make the code clear and compact, one can turn lambda expression into a method reference.

       list.forEach(System.out::println);  


----------------------------------------------------------------------------------------
 */


interface InfMethod {
	void func();
}

interface InfConstructor{  
	ConstructorRef getMessage(String msg);  
} 



class MethodRef {

	static void message() {
		System.out.println("Class: MethodRef, method: staticMethod");
	}

	void messages() {
		System.out.println("Class: MethodRef, method: InstanceMethod");
	}

}


class ConstructorRef{  
	ConstructorRef(String msg){  
		System.out.print(msg);  
	}  
} 



public class MethodAndConstructorReferences {

	public static void main(String[] args) {

		System.out.println("----Static Method Reference----");

		//providing func() implementation for InfMethod interface using lambda expression
		InfMethod impl = ()->{System.out.println("func method implementation[staticImpl]"); };
		impl.func();

		//Static-Method-reference
		InfMethod staticMethodRef = MethodRef :: message;    // calling using "::" operator
		staticMethodRef.func(); //calling message method




		System.out.println("----Instance Method Reference----");

		//providing func() re-implementation for InfMethod interface using lambda expression
		InfMethod reImpl = ()->{System.out.println("func method re-implementation[instanceImpl]"); };
		reImpl.func();

		//Instance-Method-reference
		MethodRef methodRef = new MethodRef();
		InfMethod instanceMethodRef = methodRef :: messages; 
		instanceMethodRef.func();



		System.out.println("----Constractor Method Reference----");
		
		//providing func() re-implementation for InfMethod interface using lambda expression
		InfMethod constructorImpl = ()->{System.out.println("func method re-implementation[constructorImpl]"); };
		constructorImpl.func();
		
		//Constructor-Method-reference
		InfConstructor constructorRef = ConstructorRef::new;  
		constructorRef.getMessage("Hello Constructor Reference");  

	}

}
