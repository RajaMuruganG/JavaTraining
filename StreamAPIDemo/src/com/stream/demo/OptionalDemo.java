package com.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalDemo {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Java", "JSP", "CSS", "HTML", "Angular", "React", "JavaScript", "CSS3");
		Optional<String> opt = courses.stream().filter(str -> str.startsWith("k")).findFirst();

		opt.ifPresent(System.out::println);
		opt.ifPresentOrElse(System.out::println, () -> System.out.println("Not found"));
		
		
		courses.stream()
		.filter(str -> str.startsWith("k"))
		.findFirst()
		.or(()-> Optional.of("test"));
		
		courses.stream()
		.filter(str -> str.startsWith("k"))
		.findFirst()
		.orElse("No K found");
		
		courses.stream()
		.filter(str -> str.startsWith("k"))
		.findFirst()
		.orElseGet(()-> "Supplier");
	}

}
