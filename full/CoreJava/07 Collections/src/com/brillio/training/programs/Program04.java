package com.brillio.training.programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program04 {

	public static void main(String[] args) {
		
		Set<String> names;
		
		names = new LinkedHashSet<String>();
		
		names.add("Vinod");
		names.add("Harish");
		names.add("Scott");
		names.add("Smith");
		names.add("Vinod");
		names.add("Scott");
		
		System.out.println("List contains "+ names.size() + "elements");
		System.out.println(names);
		System.out.println(names.contains("Vinod"));
		
		System.out.println(names);
	}
}
