package com.brillio.training.enitiy;

public class Triangle implements Shape {

	// Triangle t1 = new Triangle();
	// t1 instanceof Triangle -> true
	// t1 instanceof Object -> true
	// t1 instanceof Shape -> true
	
	private double base;
	private double height;
	
	public Triangle() {
	}
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}


	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void printArea() {

		double area;
		area = 0.5 * base * height;
		
		System.out.print("Triangle data:");
		System.out.printf("Base =%.2f\n", base);
		System.out.printf("Height =%.2f\n", height);
		System.out.printf("Area =%.2f\n", area);
		System.out.println("........");
		
		
	}

}
