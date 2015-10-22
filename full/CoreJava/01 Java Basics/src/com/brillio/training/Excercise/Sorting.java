package com.brillio.training.Excercise;

public class Sorting {

	static void sort(int a, int b, int c) {

		if(a<= b && b<=c )
			System.out.println(a +" " + b + " " + c);
		else if(b<= a && a<=c)
			System.out.println(b +" " + a +" " + c);
		else if(c<= a && a<=b)
			System.out.println(c + " " + a + " " + b);
		else if(a<= c && c<=b)
			System.out.println(a+ " " + c+ " " + b);
		else if(b<= a && a<=c)
			System.out.println(b+ " " + a + " " + c);
		else if(c<= b && b<=a)
			System.out.println(c +" " + b + " " + a);
	}

	public static void main(String[] args) {

		sort(56,46,14);
	}
}
