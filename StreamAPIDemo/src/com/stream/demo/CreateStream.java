package com.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

	public static void main(String[] args) {
		
		List<String> courses = Arrays.asList("Java", "JSP", "CSS", "HTML", "Angular", "React", "JavaScript","CSS3");
		courses.stream().forEach(System.out::println);
		
		Integer[] in = new Integer[] {10,12,47};
		Arrays.stream(in).forEach(System.out::println);
		
		int[] num1 = {20,22,10,05};
		Stream.of(num1).forEach(System.out::println);
		
		Stream.generate(()->10).limit(10).forEach(System.out::println);
	}
}
