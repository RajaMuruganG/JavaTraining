package com.stream.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		
		Integer[] onearr = new Integer[] {1,2,3,4,5,6};
		Stream<Integer> streamin =  Stream.of(onearr);
		//call intermediate operations
		streamin.map(num->num*2).forEach(System.out::println);
		
		
		Integer[][] twoarr = new Integer[][] {{1,2},{3,4},{5,6}};
		Stream<Integer[]> streaminarr =  Stream.of(twoarr);
		//use flatmap to convert to Stream<Integer>
		Stream<Integer> streamint = streaminarr.flatMap(onear->Arrays.stream(onear));
		//call intermediate operations
		streamint.map(num->num*2).forEach(System.out::println);
		
		
		List<List<String>> courses = Arrays.asList(
				Arrays.asList("azure","aws"),
				Arrays.asList("html","css"),
				Arrays.asList("java","spring"));
		
		Stream<List<String>> costream =  courses.stream();
		Stream<String> strstream = costream.flatMap(list->list.stream());
		strstream.map(String::toUpperCase).forEach(System.out::println);
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "java");
		map.forEach((k,v)-> System.out.println(k + v));
		
	}
}
