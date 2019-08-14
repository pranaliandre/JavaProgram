/******************************************************************************
 *  Purpose: To calculate different math function.
 *
 *  @author  Andre Pranali
 *  @version 1.30
 *  @since   14-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class MathFunction {
	//convert binary to decimal
	
	public static void binary(int n)
	
	{int count = 0;
		String x="";
		while(n>0)
		{
		int a=n%2;
		if(a==1)
		{
			
			count++;
		}
		x=x+""+a;
		n=n/2;
		
		}
		System.out.println("binary number is"+x);
		
		System.out.println("no of 1s:"+count);
	}
	
	
	//harmonic number.
	public static double harmonic(double n)
	{double sum=0;
		for(int i=1;i<=n;i++)
		{
			
			 sum =sum+  1.0 / i;
			
		}System.out.println(sum);
		return sum;
		
	}
	public static double sin(double degree)
	{
		double radian=Math.toRadians(degree);
		double sinvalue=Math.sin(degree);
		System.out.println(sinvalue);
		return radian;
		
	}
	
	public static double cos(double degree)
	{
		double radian=Math.toRadians(degree);
		double cosvalue=Math.cos(degree);
		System.out.println(cosvalue);
		return radian;
		
	}
	
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%2==0)
					return false;
					
			}
			return true;
		}
	}
	
	public static long factorial(int n)
	{ int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		return fact;
	}
	
	public static void futurevalue(int C,int r,int T)
	{
		int fv= (int) (C * Math.pow(1 + r,T)) ;
		System.out.println(fv);
	}
	
	
	public static void presentvalue(int C,int r,int T)
	{
		int pv= (int) (C / Math.pow(1 + r,T)) ;
		System.out.println(pv);
	}
	
public static void main(String[] args){
	

		System.out.println("1. Harmonic number:");
		System.out.println("2. sin of value:");
		System.out.println("3. cos of value:");
		System.out.println("4. binary number:");
		System.out.println("5. prime number:");
		System.out.println("6. factorial number:");
		System.out.println("7. future value:");
		System.out.println("8. Present value:");
		System.out.println("Enter the no of operation which you want:");
		int num=Utility.integervalue();
		
		
		if(num==1) {
			//harmonic number
			System.out.println("enter your number:");
			int n=Utility.integervalue();
			harmonic(n);
		
		}
		
		if(num==2) {
			//sin of value
			System.out.println("enter the value for  degree:");
			double degree=Utility.integervalue();
			sin(degree);
		
		}
		
		if(num==3) {
			//cos of value 
			System.out.println("enter the value for  degree:");
			double degree=Utility.integervalue();
			cos(degree);
		
		}
		
		
		if(num==4) {
			//binary number
			System.out.println("enter your number:");
			int n=Utility.integervalue();
			binary(n);
			
		}
		if(num==5)
		{
			//prime number.
			System.out.println("enter your number:");
			int n=Utility.integervalue();
			isPrime(n);
			if(isPrime(n))
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		
		}

		if(num==6) {
			//factorial number
			System.out.println("enter your number:");
			int n=Utility.integervalue();
			factorial(n);
			
		}
		if(num==7) {
			//future value
			System.out.println("enter the compound interest:");
			int c=Utility.integervalue();
			
			System.out.println("enter the rate:");
			int r=Utility.integervalue();
			
			System.out.println("enter the time period:");
			int T=Utility.integervalue();
			futurevalue(c,r,T);
		}
		
		if(num==8) {
			//present value
			System.out.println("enter the compound interest:");
			int c=Utility.integervalue();
			
			System.out.println("enter the rate:");
			int r=Utility.integervalue();
			
			System.out.println("enter the time period:");
			int T=Utility.integervalue();
			presentvalue(c,r,T);
		}
	
				
}


}
		


