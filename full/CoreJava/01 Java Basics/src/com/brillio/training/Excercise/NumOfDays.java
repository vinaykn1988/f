package com.brillio.training.Excercise;

public class NumOfDays {

	static int numofdays(int mon, int yr)
	{
		if(mon<1 || mon >12) return -1;
		else if(yr<=0) return -2;
		else if(mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12 )
		{
			if((yr%4==0) && (yr%100 != 0) || (yr%400==0))
				System.out.println(31 + "days in a month and "+ "366 days in a year");
			else
				System.out.println(31 + "days in a month and "+ "365 days in a year");
		}
		
		else if(mon == 2)
		{
			if((yr%4==0) && (yr%100 != 0) || (yr%400==0))
				System.out.println(29 + "days in a month and "+ "366 days in a year");
			else
				System.out.println(28 + "days in a month and "+ "365 days in a year");
		}
		
		else if(mon == 4 || mon == 6 || mon == 9 || mon == 11)
		{
			if((yr%4==0) && (yr%100 != 0) || (yr%400==0))
				System.out.println(30 + "days in a month and "+ "366 days in a year");
			else
				System.out.println(30 + "days in a month and "+ "365 days in a year");
		}
		return 0;
	}
	
	public static void main(String[] args) {
		numofdays(5,2016);
	}
}


