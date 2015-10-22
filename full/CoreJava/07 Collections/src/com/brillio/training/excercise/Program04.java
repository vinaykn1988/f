package com.brillio.training.excercise;

import java.util.Map;
import java.util.TreeMap;

public class Program04 {

	public static void computeWords(String st){
		
		
		String[] str = st.split(" ");
		
		for (int i = 0; i < str.length; i++) {
			
			if(str[i].contains(".")){
				str[i].replace(".", " ");
				str[i].trim();
			}
			
			if(str[i].contains(",")){
				str[i].replace(",", " ");
				str[i].trim();
			}
			
			if(str[i].contains(":")){
				str[i].replace(":", " ");
				str[i].trim();
			}
			
			if(str[i].contains("!")){
				str[i].replace("!", " ");
				str[i].trim();
			}
			
			if(str[i].contains("$")){
				str[i].replace("$", " ");
				str[i].trim();
			}
		}
		
		Map<String, Integer> m = new TreeMap<>();
		
		for (String string : str) {
			
			int n=1;
			
			if(m.containsKey(string)){
				n =m.get(string)+1;	
				
			}
			m.put(string, n);
		}
		
		System.out.println(m);
		
	}

	public static void main(String[] args) {
		
		String text = "Ramesh$ and Harish are good Friends."
				+ "Ramesh is good student. Harish is average student";
		
		computeWords(text);
	}
}
