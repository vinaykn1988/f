package com.brillio.training.programs;

import java.util.HashMap;
import java.util.Map;

import com.brillio.training.entity.Product;

public class Program06 {

	public static void main(String[] args) {
		
		Map<Integer, Product> map;
		
		map = new HashMap<>(); //default choice
		// depends on the hashCode and equals of the key
		// key must be unique, and if you try to add an object
		// for key that already exists, it will overwrite the 
		// existing object
		
		Product product = new Product(78, "chai", "Beverages", 18.3);
		map.put(product.getId(), product);
		
		product = new Product(29, "Chang", "Beverages", 8.49);
		map.put(product.getId(), product);
		
		product = new Product(33, "Ikura", "seafood", 128.3);
		map.put(product.getId(), product);
		
		product = new Product(78, "Green tea", "Beverages", 23.1);
		map.put(product.getId(), product);
		
		System.out.println("There are"+ map.size() + "items");
		System.out.println(map);
		
		System.out.println(map.keySet());
		
		System.out.println(map.values());
	
		int key = 33;
		
		Product p = map.get(key);
		
		if(p==null){
			System.out.println("no product with id "+ key);
			
		}
		else
			System.out.println("Product with id"+ key + "is" + p);
		
	}
}
