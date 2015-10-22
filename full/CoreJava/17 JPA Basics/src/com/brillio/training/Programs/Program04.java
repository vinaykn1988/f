package com.brillio.training.Programs;

import java.io.FileOutputStream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.brillio.training.entity.Category;

public class Program04 {

	public static void main(String[] args) throws Exception {
		
		// reads the META-INF/persistence.xml file
		// and creates an instanceof EntityManagerFactory
		// based on the information available in the xml tag
		// <persistence-unit name="nwind=pu"
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("nwind-pu");
		
		// while the "emf" represents the database,
		// "em" represent an active open connection to the database
		EntityManager em = emf.createEntityManager();
		
		int id=1;
		Category cat = em.find(Category.class,1);
		System.out.println("Name =" + cat.getCategoryName());
		System.out.println("Desc =" + cat.getDescription());
		
		String fname = "category_" + id + ".jpg";
		FileOutputStream out = new FileOutputStream(fname);
		out.write(cat.getPicture());
		out.close();
		
		System.out.println("Picture saved to file: " + fname);
	}
	
}
