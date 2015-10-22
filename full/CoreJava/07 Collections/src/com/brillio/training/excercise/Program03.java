package com.brillio.training.excercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Program03 {

	static Comparator<String> cmp = new Comparator<String>(){
		@Override
		public int compare(String o1, String o2) {
		return	o1.length() - o2.length();
		
		}
	};
	
	private static void compute(String st, int i) {

		Set<String> str = new TreeSet<>();
		
		String[] s = st.split(" ");
		
		
		
		List<String> li = new ArrayList<>();
		
		for (String string : s) {
		   li.add(string);	
		}

		
		if(i==2){
	
			Collections.sort(li,cmp);
		}
		
		for(String ss : li){
			str.add(ss);
		}
	
		System.out.println(str);
	}

	
	public static void main(String[] args) {

		String st = "Malayalam. novelist Sarah. Joseph on Saturday. returned her Sahitya Akademi award";

	final int n = 1;

		compute(st, n);

	}

}
