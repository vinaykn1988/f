package com.brillio.training.programs;

import com.brillio.training.util.KeyboardUtil;

public class Program05 {

	public static void main(String[] args) {
		
		int id;
		String name;
		double salary;
		
		id = KeyboardUtil.getInt("Enter id: ");
		name = KeyboardUtil.getString("Enter name: ");
		salary = KeyboardUtil.getDouble("Enter salary: ");
		
		System.out.println("Name = "+ name);
		System.out.println("id = "+ id);
		System.out.println("Salary = "+ salary);
	}
}
