package com.brillio.training.programs;

import java.util.Arrays;

public class Program02 {

	public static void main(String[] args) {
	
		int [][] nums = {{34},{567,324},{23,3456,23,56},{213,345,78}};
		
		for (int i = 0; i < nums.length; i++) {
			
			System.out.println(Arrays.toString(nums[i]));
		}
		
	}
}
