package com.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<String> pred = (str) -> str.length() > 3;

		Consumer<String> cons = (str) -> System.out.println(str);
		// foreach

		Function<String, String> fun =str-> str.toUpperCase();
		
		List<String> courses = Arrays.asList("Java", "JSP", "CSS", "HTML", "Angular", "React", "JavaScript","CSS3");

		courses.stream()
		.filter(course -> course.length() > 3)
		.forEach(System.out::println);
//		.forEach(str -> System.out.println(str));
		
		
		System.out.println();
		
		List<String> limitedCourses = courses.stream()
		.filter(course -> course.length() > 3)
		.distinct()
//		.sorted()
		.sorted((s1,s2)-> s2.compareTo(s1))
		.skip(2)
//		.limit(3)
		.collect(Collectors.toList());
//		.toList();
		limitedCourses.forEach(System.out::println);
	
		
		System.out.println();
		
		courses.stream()
		.filter(course -> course.length() > 3)
		.map(String::length)
		.forEach(System.out::println);
	}

}
