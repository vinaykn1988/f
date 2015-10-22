package com.brillio.training.Excercise;

public class FutureTime {
	
	static int time(int h, int m, int s, int f){
		
		if(h<0 || m<0 || s<0 || f<0) return -1;
		else 
		{
			h = h + (int)(f/3600);
			m = m + (int)((f%3600)/60);
			s = s + (int)((f%60));
			
			System.out.println("the new time is " + h + " hours " + m + " minutes " + s + " seconds");
		}
		return 0;
			
	}

	public static void main(String[] args) {
		time(12,0,0,3600);
		time(8,15,0,910);
	}
}
