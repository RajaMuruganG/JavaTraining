package com.list.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap();
//		Map<Integer,String> map = new LinkedHashMap<>();
//		Map<Integer,String> map = new TreeMap();
		map.put(1, "Ram");
//		map.put(null, "Rohan");
		map.put(12, null);
		map.put(33, "John");
		map.put(1, "Kevin");
		
		System.out.println(map);
		System.out.println(map.get(1)); //Kevin
		System.out.println(map.get(10)); //null
		System.out.println(map.containsKey(10)); //Kevin
		System.out.println(map.getOrDefault(10, "Sri"));
		System.out.println(map);
		System.out.println();
		// using keyset
		//get the keys
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key+" " +map.get(key));
		}
		
		//using entry set
		Set<Entry<Integer,String>> entryset =  map.entrySet();
		System.out.println(entryset);
		
		for(Entry<Integer,String> entry:entryset) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
