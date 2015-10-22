package com.brillio.training.Programs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.brillio.training.entity.Category;
import com.brillio.training.entity.Product;

public class Program08 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nwind-pu");
		EntityManager em = emf.createEntityManager();
		
		int id=1;
		Category cat = em.find(Category.class, id);
		
		System.out.println("Name:"+ cat.getCategoryName());
		System.out.println("Desc:" + cat.getDescription());
		System.out.println("Products in this category are");
		for (Product p : cat.getProducts()) {
			System.out.println("\t" + p.getProductName());
		}
		
	}
	
}
