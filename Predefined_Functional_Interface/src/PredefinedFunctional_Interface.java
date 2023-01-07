import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/*
 Some important predefined functional interfaces are

                           one input----
 1. Predicate
 2. Function
 3. Consumer
 4. Supplier

                           Two input----
 5. BiPredicate    
 6. BiFunction
 7. BiConsumer 
 8. BiSupplier


 Primitive Functional Interface
 1. IntPredicate
 2. IntFunction
 3. IntConsumer

 --------------------------------------------------------------------------------

 Predicate: 

 Syntax:    interface Predicate{

                  public boolean test(T t);
                        }

                   i/p:  t(any type) 
           return type:  boolean    

         -Whenever some condition need to check or boolean check needed
          we should go for Predicate interface.
         -it contain test() which takes argument & return boolean. 

    example: even or odd     

  limitation:
          only return boolean.
         - to overcome this Function introduced        

 ----------------------------------------------------------------------------------  


 Function: 

 Syntax:    interface Function{

               public R apply(T t);
                        }

                   i/p:  t(any type) 
           return type:  R(any type)    

         -Whenever need some result
          we should go for Function interface.
         -it contain apply() which takes argument & return result.


    example: square or cube of numbers    

 ----------------------------------------------------------------------------------               


 Consumer: 

 Syntax:    interface Consumer{

               public void accept(T t);
                        }

                   i/p:  t(any type) 
           return type:  void   

         -Whenever no need result
          we should go for Consumer interface.
         -it contain accept() which takes argument & return nothing.


    example: print name


  ------------------------------------------------------------------------------------ 

 Supplier: 

 Syntax:    interface Supplier{

               public R get();
                        }

                   i/p:  none
           return type:  R(any type)   

         -Whenever we need result no input is there
          we should go for Supplier interface.
         -it contain get() which takes nothing & return result.


    example: 


 */
public class PredefinedFunctional_Interface {

	static void printName(String name){  
		System.out.println("Hello "+name);  
	}  
	static void printValue(int val){  
		System.out.println(val);  
	}  

	public static void main(String[] args) {

		System.out.println("Predicate Example.....");

		// Creating predicate
		Predicate<Integer> predicateExample = num -> (num%2==0);

		// Calling Predicate method
		System.out.println(predicateExample.test(10));  //true  
		System.out.println(predicateExample.test(15));  //false  


		System.out.println("Function Example.....");



		// Creating Function, 1st Integer is i/p, 2nd Integer is result
		Function<Integer,Integer > functionExample = num -> (num*num*num); 

		// Calling Function method
		System.out.println(functionExample.apply(10));    //1000
		System.out.println(functionExample.apply(15));    //3375 

		System.out.println("Consumer Example....."); 




		// Referring method to String type Consumer interface   
		Consumer<String> consumerExample = PredefinedFunctional_Interface::printName;  
		consumerExample.accept("PALASH");   // Calling Consumer method  


		// Referring method to Integer type Consumer interface  
		Consumer<Integer> consumer2 = PredefinedFunctional_Interface::printValue;  
		consumer2.accept(12);   // Calling Consumer method 


	}

}
