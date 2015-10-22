package com.brillio.training.programs;

import com.brillio.training.entity.Address;
import com.brillio.training.entity.Customer;


public class Program01 {

	public static void main(String[] args) {
		Customer c1 = new Customer(7788, "Ravi", "Kumar");
		
		Address a1 = new Address("1st cross, 1st main", "jayanagar",
										"Bangalore", "KA", "India");
		c1.setAddress(a1);
		c1.print();
	}
	
}
