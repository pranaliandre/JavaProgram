

package com.bridgelabz.functional;

public class Calendar 
{
	
	 public static int Cal(int d, int m, int y) 
	 {
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
		
		
	}
	 
	  
	// Driver Program to test above function 
	public static void main(String args[]) 
	{ 

		int d = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		int day=Cal(d, m, y);
		if(day==0)
		{
			System.out.print("Sunday");
		}
		if(day==1)
		{
			System.out.print("Monday");
		}
		if(day==2)
		{
			System.out.print("Tuesday");
		}
		if(day==3)
		{
			System.out.print("Wednesday");
		}
		if(day==4)
		{
			System.out.print("Thursday");
		}
		if(day== 5)
		{
			System.out.print("Friday");
		}
		if(day==6)
		{
			System.out.print("Saturday");
		}
	}
	} 