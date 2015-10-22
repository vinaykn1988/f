package com.brillio.training.exercise;

public class Add {

	public static void add(int[] arr){
		
		int even=0,odd=0;
		int[] res = new int[2];
		
		if(arr.length == 0){
			System.out.println("Input array is empty");
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]%2 == 0)
				even += arr[i];
			else
				odd += arr[i];
		}
		
		res[0] = even;
		res[1] = odd;
		
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
	
	public static void main(String[] args) {

		int[] arr = new int[] {10,15,16,19,20};
		
		add(arr);

	}
}
