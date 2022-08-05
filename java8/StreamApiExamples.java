package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiExamples {
	public static void main(String[] args) {

		// create a list of integers
		List<Integer> number = Arrays.asList(2, 3, 4, 5);
		List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

		// map method
		List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(square);


		//filter method
		List<String> result = names.stream().filter(s -> s.startsWith("R")).collect(Collectors.toList());
		System.out.println(result);
		
		//sorted method
	    List<String> show = names.stream().sorted().collect(Collectors.toList());
	    System.out.println(show);

	  
	    // collect method returns a set
	    Set<Integer> squareSet = number.stream().map(x->x*x).collect(Collectors.toSet());
	    System.out.println(squareSet);
	  
	    // demonstration of forEach method
	    number.stream().map(x->x*x).forEach(y->System.out.println(y));
	  
	    // demonstration of reduce method
	    int even =number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
	  
	    System.out.println(even);

	}

}
