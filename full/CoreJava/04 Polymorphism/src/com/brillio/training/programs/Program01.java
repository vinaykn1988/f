package com.brillio.training.programs;

import com.brillio.training.enitiy.Animal;
import com.brillio.training.enitiy.Cat;
import com.brillio.training.enitiy.Dog;
import com.brillio.training.enitiy.Tiger;

public class Program01 {

	public static void main(String[] args) {
		
		Animal a1;			// reference of Animal type
		
		Cat c1 = new Cat(); // reference to an object of Cat type
		Dog d1 = new Dog(); // reference to an object of Dog type
		
		a1 = c1;	// c1 instanceof Animal; hence can be assigned to a1		
		a1.talk();  // compiler checks if talk() exists in Animal
					// At the runtime, a1 refers to an object of Cat
					// and the talk() from Cat class is executed
	
		a1 = d1;
		a1.talk();  // once again, compiler checks if talk() is 
					// available in Animal, but at the runtime the
					// method talk() from the instance type
					// (which is dog) is invoked
		
		// Line 17 and 22 are identical, but produce different result
		
		Tiger t1 = new Tiger();
		
		a1 = t1;
		a1.talk();
	}
}
