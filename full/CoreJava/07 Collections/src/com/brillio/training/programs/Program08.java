package com.brillio.training.programs;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Program08 {

	public static void main(String[] args) {
		
		Map<Integer, Set<String>>	map = new TreeMap();
		
		map.put(7788, new TreeSet<String>());
		map.put(7764, new TreeSet<String>());
		map.put(8976, new TreeSet<String>());
		
		System.out.println(map);
		// Employee 7788 has taken 2 books
		// 1. Let us C,
		
		map.get(7788).add("Let us C");
		map.get(7788).add("Java Complete Reference");
		
		System.out.println(map.get(7788));
		
		// Employee 8976 has taken 3 books
		// 1. Python unleashed
		// 2. Learning Python in Easy Steps
		// 3. Python in action
		
		map.get(8976).add("Python Unleashed");
		map.get(8976).add("Learning Python in Easy Steps");
		map.get(8976).add("Python in action");
		
		System.out.println(map.get(8976));
	}
	
}
