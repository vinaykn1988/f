package com.brillio.training.programs;

import java.util.ResourceBundle;

public class Program08 {

	public static void main(String[] args) {
		
		// a file called "info.properties"
		// in the folder "src/com/brillio/training"
		String baseName = "com.brillio.training.info";
		ResourceBundle rb = ResourceBundle.getBundle(baseName);
		
		
		
		String name = rb.getString("name");
		String phone_no = rb.getString("phone");
		String email = rb.getString("email");
		String city = rb.getString("city");
		
		System.out.println("Name			=" + name);
		System.out.println("City			=" + city);
		System.out.println("Email id		=" + email);
		System.out.println("Phone no		=" + phone_no);
		
		
	}
	
}
