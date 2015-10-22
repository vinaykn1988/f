package com.brillio.training.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program07 {

	public static void main(String[] args) {
		Map<String, String> contacts = new LinkedHashMap<>();
		
		contacts.put("vinod@vinod.co", "Vinod Kumar, 9873543950");
		contacts.put("vinay@gmail.com", "Vinay kumar, 9980365232");
		contacts.put("vijay@gmail.com", "Vijay Kumar, 9856477567");
		contacts.put("naveen@hotmail.com", "Naveen Kumar, 9834654677");
		
		System.out.println(contacts);
		
		String str = "vinod@vinod.co";
		
		System.out.println(contacts.get(str));
		
		System.out.println(contacts);
		
		
		
	}
}
