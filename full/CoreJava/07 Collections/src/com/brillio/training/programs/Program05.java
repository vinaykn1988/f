package com.brillio.training.programs;

import java.util.Set;
import java.util.TreeSet;

import com.brillio.training.entity.Product;

public class Program05 {
	public static void main(String[] args) {
	
		Set<Product>	products = new TreeSet<Product>();
		Product p1,p2,p3,p4;
		
		p1 = new Product(16, "Chai", "Beverages", 18.3);
		p2 = new Product(228, "Chang", "Beverages", 123.5);
		p3 = new Product(39, "Aniseed syrup", "Beverages", 42.32);
		p4 = new Product(4, "Ikura", "Seafood", 11.13);
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(new Product(38, "XYZ", "PQR", 22.3));
		System.out.println("Size =" + products.size());
		
		System.out.println("p1.Hashcode = "+ p1.hashCode());
		System.out.println("p2.Hashcode = "+ p1.hashCode());
		System.out.println("p3.Hashcode = "+ p1.hashCode());
		System.out.println("p4.Hashcode = "+ p1.hashCode());
		
		System.out.println("p1==p2" + (p1==p2));
		System.out.println("p1.equals(p2) = " + p1.equals(p2));
		
		for (Product product : products) {
			System.out.println(product);
		}
}
	
}
