package com.brillio.training.programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program09 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("De villers");
		names.add("Amla");
		names.add("faf du plusssis");
		names.add("Morkel");
		names.add("Jacob oram");
		names.add("kohli");
		names.add("Miller");
		names.add("Rohit Sharma");

		Collections.sort(names);
		System.out.println(names);
		
		Collections.sort(names, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {

				
				return o1.length() - o2.length();
			}
			
		});
		
		System.out.println(names);
	}
}
