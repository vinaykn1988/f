package com.brillio.training.programs;

import java.util.Arrays;

public class Program01 {
	
	public static void increment(int[] ar, int by){
		
		for (int i = 0; i < ar.length; i++) {
			
			ar[i] += by;
			
		}
	}

	public static void main(String[] args) {
		
		
		// n is a  reference to an array object
		int[] n = {12,34,465};
		
		// n = new int[3];
		// n = {12,445,567};  //error
		
		n = new int[] {45,68,345};
		
		n[2] = 12;
		n[0] = 22;
		n[1] = 355;
		
		int index = 2;
		System.out.println(n[index]);
		
		System.out.println(Arrays.toString(n));
		increment(n,10);
		System.out.println(Arrays.toString(n));
		
		n[-1] = 50;  // throws ArrayIndexOutOfBoundsException()
		n[3]  = 34;  // throws ArrayIndexOutOfBoundsException()
	}
}
