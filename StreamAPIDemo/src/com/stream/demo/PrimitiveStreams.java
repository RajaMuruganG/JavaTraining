package com.stream.demo;
import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;

public class PrimitiveStreams {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6};
		//convert to a stream
		int sum = Arrays.stream(nums)
			   .filter(n->n%2==0)
			   .sum();
		System.out.println(sum);
		// get the sum of length of all elements
		sum = Arrays.asList("java","css","spring")
		  .stream()
		  .map(String::length) // Stream<Integer>
		  .reduce(10,(x,y)->x+y);
//		  .get();
		System.out.println(sum);
		
		
		sum = Arrays.asList("java","css","spring")
		  .stream()
		  .mapToInt(str-> str.length()) //IntStream
		  .sum();
		System.out.println(sum);
		
		double avg = Arrays.asList("java","css","spring")
				  .stream()
				  .mapToDouble(String::length) //DoubleStream
				  .average()
				  .getAsDouble();
				System.out.println(avg);
				
				IntStream.rangeClosed(10,20)
				.map(x->x*2)
				.forEach(System.out::println);
				
				
				
				
				
	}
}
