package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Program05 {

	public static void main(String[] args) {
		
		Person p1 = new Person(1344,"Raj kumar", "Bangalore");
		
		// persons is not a reference to a Person object
		// but it is a reference to an array of Person object
		Person[] persons = {
				new Person(), 
				new Person(7788, "John Scott", "Newyork"),
				new Person(7865, "Ramesh Kumar", "Chennai"),
				p1
		};
		
		persons = new Person[3];
		
//		persons[0] = new Person(1, "Scott", "California");
//		persons[1] = new Person(2, "David", "Texas");
//		persons[2] = new Person(3, "Peter", "New york");
		
		for (Person per : persons) {
			
			System.out.println(per);
		}
	}
}
