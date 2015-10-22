package com.brillio.training.exercise;

public class Smallest {

	public static int[] small(int[] a1, int[] a2){
		
		
		if(a1.length == 0)
		{
			return a2;
		}
	
		if(a2.length == 0){	
			return a1;
		}
		
		int[] res;
		int n;
		
		if(a1.length>a2.length){
			
			res = new int[a1.length];
			res = a1;
			n = a2.length;
		}
		else
		{
			res = new int[a2.length];
			res = a2;
			n = a1.length;
		}
		
		for(int i=0;i<n;i++){
			
			if(a1[i]<=a2[i]){
				res[i] = a1[i];
			}
			else{
				res[i] = a2[i];
			}
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr1 = new int[] {23,54,64,21,34};
		int[] arr2 = new int[] {15,18,19};
		
		 int[] result = small(arr1, arr2);
		 
			for (int i = 0; i < result.length; i++) {
				
				System.out.println(result[i]);
			}
	}
	
}
