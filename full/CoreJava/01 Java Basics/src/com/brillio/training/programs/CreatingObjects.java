package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class CreatingObjects {

	public static void main(String[] args) {
		Person p1; // a reference variable
		p1 = new Person(); // total of 12 bytes allocated in heap(eden)
		System.out.println("name = " + p1.name);
		System.out.println("age = " + p1.age + " years");
	}
}
