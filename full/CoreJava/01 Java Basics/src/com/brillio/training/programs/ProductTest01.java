package com.brillio.training.programs;

import com.brillio.training.entity.Product;

public class ProductTest01 {

	public static void main(String[] args) {
		
		Product p1;
		p1 = new Product();
		
		Product p2 = new Product(78, "chai", "A.K.A Tea", 78.9, 120);
		
		p1.setId(100);
		p1.setName("Bisleri");
		p1.setDescription("Mineral Water");
		p1.setPrice(25.0);
		p1.setUnitsInStock(128);
		
		System.out.println(p1);
		System.out.println(p1.toString());
		System.out.println(p2);
		
	}	
}
