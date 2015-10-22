package com.brillio.training.Programs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.brillio.training.entity.Shipper;

public class Program01 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf;
		EntityManager em;
		
		// reads the META-INF/persistence.xml file
		emf=Persistence.createEntityManagerFactory("nwind-pu");
		em = emf.createEntityManager();
		
		int id=1;
		Shipper s1 = em.find(Shipper.class, id);
		em.close();
		
		System.out.println(s1);
	}
	
}