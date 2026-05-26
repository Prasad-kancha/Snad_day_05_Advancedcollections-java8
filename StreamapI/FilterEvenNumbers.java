package StreamapI;

import java.util.*;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
  public static void main(String[] args) {
	
	  List<Integer> list=Arrays.asList(5,10,15,20,25,30);
	  
	  List<Integer> even=
			  list.stream()
			  .filter( n-> n % 2 == 0)
			  .collect(Collectors.toList());
			  
			  
//	  for(int i:even) {
//		  System.out.println(i);
//	  }
	  System.out.println("even numbers are "+ even);
}
}
