package com.brillio.training.excercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program01 {

	public static void compute(String str){
		
	String[] s = str.split(" ");
	
	List<String> li = new ArrayList<>();
	
	Comparator<String> cmp = new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			
			return o1.length() - o2.length();
		}
		
		
	};
	
	for (String string : s) {
		li.add(string);
	}
	
	Collections.sort(li, cmp);
	
	for (String string : li) {
		System.out.println(string);
	}
	
		
	}
	
	
	public static void main(String[] args) {
	
		String st = "Python for beginners";
		
		compute(st);
	}
	
}
