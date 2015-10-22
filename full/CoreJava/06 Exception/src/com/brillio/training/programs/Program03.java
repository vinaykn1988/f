package com.brillio.training.programs;

public class Program03 {

	public static void main(String[] args) {
		int num=0, sum=0, avg=0, ni=0,nni=0;
		if(args.length == 0){
			System.out.println("no input");
			return;
		}
		
		if(Integer.parseInt(args[0]) < 1){
			System.out.println("First argument should be > 0");
			return;
		}

		try{
		   num = Integer.parseInt(args[0]);
		}
		
		catch (NumberFormatException e){
		    	System.out.println("First argument should be int");
		}
		
		if(args.length!= num + 1){
			System.out.println("Insufficient inputs");
		}
		
		
		for(int i=1;i<=num;i++){
		try{
			sum += Integer.parseInt(args[i]);
			ni++;
		}
		catch(NumberFormatException e){
			nni++;
		}
		}
		avg = sum/(num-1);
		
		System.out.println("Sum is"+ sum);
		System.out.println("Avg is"+ avg);
		System.out.println("Numerical inputs is"+ ni);
		System.out.println("Non-numerical inputs is"+ nni);
	}
	
	}

