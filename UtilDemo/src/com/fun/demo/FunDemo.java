package com.fun.demo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.bean.Book;

public class FunDemo {

	public static void main(String[] args) {
		Consumer<String> con = t -> System.out.println(t.toUpperCase()); //implementation
		con.accept("test consumer");// calling
		
		
		Supplier<Integer> supplier = ()-> 10;
		System.out.println(supplier.get());
		
		Predicate<String> predicate = t-> t.equalsIgnoreCase("test");
		System.out.println(predicate.test("TEST"));
		
		Predicate<Book> predicateBook = book-> book.getTitle().equals("java");
		System.out.println(predicateBook.test(new Book("Java", 1, "Raja")));
		
		//Important
		Function<String, Integer> fun = (str)-> str.length(); // <String, Integer> => <Input, ReturnType>
		System.out.println(fun.apply("Functional Interface"));
		
	}
}
