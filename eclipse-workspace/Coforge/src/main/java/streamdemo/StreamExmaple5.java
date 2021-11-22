package streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamExmaple5 {

	public static void main(String[] args) {
		
		//limit function
		//iterate-- used to define infinte sequential stream
		Stream<Integer> evenInfiniteStream=Stream.iterate(0, n->n+2);
		
		List<Integer> evenList=evenInfiniteStream.limit(10).collect(Collectors.toList());
		System.out.println("List Even Nos with Limit 10");
		System.out.println(evenList);
		
		System.out.println("**************************");
		
		Stream<Integer> oddInfiniteStream=Stream.iterate(1, n->n+2);
		//converting stream to set
		Set<Integer> oddList= oddInfiniteStream.limit(20).collect(Collectors.toSet());
		System.out.println("Set Odd Nos with Limit 10");
		System.out.println(oddList);

		//Distinct - filter unique elements 
		
		List<String> desig=Arrays.asList("Manager","Technician","Salesman","Developer","Manager");
		List<String> distinctDesig=desig.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctDesig);
		
		//skip() - skips the first n elements
		Stream<Integer> evenInfiniteStream1=Stream.iterate(0, n->n+2);
		
		List<Integer> evenList1=evenInfiniteStream1.skip(5).limit(10).collect(Collectors.toList());
		System.out.println("List Even Nos skipping first 5 elements with Limit 10");
		System.out.println(evenList1);
		
		//anyMatch() -- used for checking the existence
		boolean match=desig.stream().anyMatch(s->s.contains("Developer"));
		System.out.println("Developer exists or not? : "+match);
	}

}
