package com.brillio.training.programs;

import java.util.Date;

import com.brillio.training.util.KeyboardUtil;

public class Program07 {

	public static void main(String[] args) {
		
		String name;
		Date dob;
		
		name = KeyboardUtil.getString("Enter name: ");
		dob = KeyboardUtil.getDate("Enter birth date");
		
		System.out.println("You entered");
		System.out.println(name);
		System.out.println(dob);
	}
}
