package com.brillio.training.Excercise;

public class Assignment {

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
		
		// 3. Find the future time
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
		
		
		// 4. Digit Ordering in a number
		static void ordering(long n){
			
			int digit;
			long temp;
			
			if(n>0)
			{
			 for (digit=0;digit<9;digit++)
			   for (temp=n;temp>0;temp/=10)
			     if (temp%10==digit) 
			    	 System.out.print(" " + digit);
			}
			
			else 
			{
				n = n * -1;
				for (digit=9;digit>0;digit--)
					   for (temp=n;temp>0;temp/=10)
					     if (temp%10==digit) 
					    	 System.out.print(" " + digit);
				
			}
		}
					
				
		// 5. Sum of prime numbers between the given boundaries
		static void prime(int begin, int end)
		{
			if(begin<0)begin=2;
			
			if(end<0)end=2;
			
			int sum = 0;
			
			if(begin > end)
			{
				
				int temp = begin;
				begin = end;
				end = begin;
			}
			
			for(int i=begin;i<=end;i++)
			{
			if(isPrime(i))
				sum += i;
			}
			
			System.out.println(sum);
		}
		
		
			static boolean isPrime(int n)
			{
				for(int j=2;j<=n/2;j++)
				{
					if(n%j==0)
						return false;
					
				}
				return true;
			}
		
			
			
			//6. Reverse of a number		
			static void reverse(long n)
			{
				
				long num = n;
				
				while(num%10 == 0)
				{
					num = num/10;
				}
				
				while(num/10 !=0)
				{
				System.out.print(num%10);
				num = num/10;
				}
				System.out.print(num);
			}
		

			//7. Binary to decimal
			
			static void staticToDecimal(long n)
			{
				int sum=0, i=0;
				
				while(n>=1)
				{
					sum += (n%10)*Math.pow(2, i);
					 n = n/10;
					 i++;
				}
				
				System.out.println("The decimal version is" + sum);
				
			}
			
			

		
		
		public static void main(String[] args) {

//			sort(56,46,14);    // 1. sorting the numbers in ascending order
//			numofdays(5,2016); // 2. Printing the number of days in a given month and year	
//			time(12,0,0,3600); // 3. To print the future time
//			time(8,15,0,910);  // 3.
//			ordering(435354); 	// 4. Digit ordering +ve number
//			ordering(-435354);	// 4. Digit ordering -ve number
//			prime(10,50);
//			reverse(24050009);
//			staticToDecimal(1101);
//			squareRoot(50);
		}
	}



