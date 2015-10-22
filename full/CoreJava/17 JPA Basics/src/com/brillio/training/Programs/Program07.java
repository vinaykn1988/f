package com.brillio.training.Programs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.brillio.training.entity.Product;

public class Program07 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nwind-pu");
		EntityManager em = emf.createEntityManager();
		
		int id=1;
		Product p1 = em.find(Product.class, id);
		
		System.out.println("Product name:"+ p1.getProductName());
		System.out.println("Supplier:" + p1.getSupplier().getCompanyName());
	}
}