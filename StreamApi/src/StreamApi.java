import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 
 Stream API::
 
 Collection vs Stream
 
 Collection:
          If we want to represent group of object in a single unit we need Collection.
          -In java Collection provide interfaces which helps us achieve collection
          
 Stream:
     If we want to process(like map, filter, count) collection object we need Stream.          
     
    -Java8 provide a new package java.util.stream that consists of several classes, interfaces
     to perform the stream-based operations. 
     
     class:: Collectors 
            -Collectors is a final class that extends Object class
            
     Interface: 
     
     Methods::
           -stream(): make it stream
           
           -filter(): filter particular object based on condition, works on conditional operator
                    Example: find even & odd
           
           -map(): do operation with each & every object.
                  Example: add +5 with each & every object
                  
           
           -collect(): (Collectors.toList()); // collecting as list
           
           -count(): count number of object
           
 Note:
    filter(Predicate ***): filter take predicate
       
    map(Function ***): map take function 
    
                
     
 
 */
public class StreamApi {
	
	public static void filterFunction(){
		// find even number
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(5);
		numbers.add(10);
		numbers.add(20);
		numbers.add(15);
		
		List<Integer> evenNumbers=numbers.stream().filter((n)->n%2==0).collect(Collectors.toList());
		
		System.out.println(evenNumbers);
			
	}
	
	public static void mapFunction(){
		
		// add +2 with each number
				ArrayList<Integer> numbers = new ArrayList<Integer>();

				numbers.add(5);
				numbers.add(10);
				numbers.add(20);
				numbers.add(15);
				
				List<Integer> updateNumbers=numbers.stream().map((n)->n+2).collect(Collectors.toList());
				
				System.out.println(updateNumbers);
		
		
	}
	
	public static void listToSetConversion(){
		
		List<Integer> numbers = new ArrayList<Integer>(); 
		
		numbers.add(5);
		numbers.add(10);
		numbers.add(20);
		numbers.add(15);
		
        System.out.println(numbers);
        
        Stream<Integer> stream = numbers.stream();
        Set<Integer> set = stream.collect(Collectors.toSet());
        
        System.out.println("Set Values = "+set);
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("FilterMethod.....");
		filterFunction();
		
		System.out.println("MapMethod.....");
		mapFunction();
		
		System.out.println("List to set conversion.....");
		listToSetConversion();
		

	}

}
