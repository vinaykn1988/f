package com.brillio.training.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.brillio.training.entity.Person;

public class Program10 {

	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("vijay", "Bangalore"));
		persons.add(new Person("vinay", "Bangalore"));
		persons.add(new Person("Naveen", "Mangalore"));
		persons.add(new Person("Vijendra", "Chennai"));
		persons.add(new Person("Keval", "Jaipur"));
		
		Comparator<Person> cmp = new Comparator<Person>(){
			
		 public int compare(Person p1, Person p2){
			 return p1.getName().compareTo(p2.getName());
		 }
		};
		
		Collections.sort(persons, cmp);
		
		for (Person p : persons) {
			
			System.out.println(p);
		}
		
		
	}
	
}
