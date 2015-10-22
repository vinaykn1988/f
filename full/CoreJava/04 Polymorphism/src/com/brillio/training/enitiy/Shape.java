package com.brillio.training.enitiy;

public interface Shape {
	
	// variables declared inside an interface will be
	// automatically treated as public, static and final,
	// and has to be initialized with a value
	double PI = 3.1416;
	
	//methods in an interface will be public and abstract
	// and need not be marked as abstract. You can not define
	// a method body for an interface method
	void printArea();
}
