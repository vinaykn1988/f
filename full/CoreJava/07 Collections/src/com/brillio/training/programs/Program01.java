package com.brillio.training.programs;

import java.util.ArrayList;
import java.util.List;

public class Program01 {

	public static void main(String[] args) {
		
		List<String> list;
		
		list = new ArrayList<String>();
		
		list.add("Vinod");
		list.add(0,"Harish");
		list.add("Scott");
		list.add("Smith");
		list.add("Vinod");
		list.add("Scott");
		
		System.out.println("List contains "+ list.size() + "elements");
		System.out.println(list);
		System.out.println(list.contains("Vinod"));
		System.out.println(list.indexOf("Vinod"));
		System.out.println(list.lastIndexOf("Vinod"));
		list.remove(4);
		
		System.out.println(list);
	}
}
