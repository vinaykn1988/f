package com.brillio.training.Programs;

import java.io.FileInputStream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.brillio.training.entity.Category;

public class Program05 {

	public static void main(String[] args) throws Exception{
		
		FileInputStream in = new FileInputStream("beverages.jpg");
		byte[] bytes = new byte[in.available()];
		in.read(bytes);
		in.close();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nwind-pu");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		// get the category instance
		int id=1;
		Category c1 = em.find(Category.class, id);
		
		// chances to the entity instance with in a transaction
		// automatically updates to the database
		c1.setPicture(bytes);
		
		tx.commit();
		em.close();
		
	}
	
}
