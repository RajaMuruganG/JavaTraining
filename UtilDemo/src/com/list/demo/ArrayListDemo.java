package com.list.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list.size());
		list.add("Ram");
		list.add("Tom");
		System.out.println(list);
		list.add(1,"Poppy");
		System.out.println(list);
		list.add("Tom");
		list.set(0, "Kevin");
		System.out.println(list);
		System.out.println(list.size());
		for(String s:list) {
			System.out.println(s.toUpperCase());
		}
		System.out.println();
		Iterator<String> i= list.iterator();
		while (i.hasNext()) {
			String str =  i.next();
			System.out.println(str);
		}
		System.out.println();
		ListIterator<String> iterator = list.listIterator(list.size());
		while (iterator.hasPrevious()) {
			String str =  iterator.previous();
			System.out.println(str);
			
		}
	}
}
