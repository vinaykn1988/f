package com.brillio.training.exercise;

public class Merge {

	public static void merge(int[] a1, int[] a2){
		
		int[] res = new int[a1.length + a2.length];
		
		System.arraycopy(a1, 0, res, 0, a1.length);
		System.arraycopy(a2, 0, res, a1.length, a2.length);

		for (int i = 0; i < res.length; i++) {
			if(res[i]%2!=0){
				System.out.println(res[i]);
			}
		}
		
	}
	public static void main(String[] args) {
		
		int[] arr1 = new int[] {7,20,30};
		int[] arr2 = new int[] {40,50,60};
		
		merge(arr1, arr2);
	}
	
}
