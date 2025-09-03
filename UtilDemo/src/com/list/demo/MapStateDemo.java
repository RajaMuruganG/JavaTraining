package com.list.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapStateDemo {

	public static void main(String[] args) {

		Map<String, List<String>> states = new HashMap<>();
		states.put("TN", Arrays.asList("Chennai", "Madurai", "Covai", "Trichy"));
		states.put("KA", Arrays.asList("Bangalore", "Mysore", "Mangalore", "Coorge"));
		states.put("KL", Arrays.asList("Trivandram", "Cochine", "Erankulam", "Palakadu"));
		states.put("MH", Arrays.asList("Mumbai", "Pune"));
		
		System.out.println(states);
		System.out.println(states.get("AP"));
		System.out.println(states.getOrDefault("AP", Arrays.asList("Kadapa","Kurnool","Chitt0or")));
		
		System.out.println();
		
		Set<Entry<String, List<String>>> statesEntrySet=states.entrySet();
		
		for (Entry<String, List<String>> state : statesEntrySet) {
			System.out.println(state.getKey()+"-> "+state.getValue());
		}
		
	}
}
