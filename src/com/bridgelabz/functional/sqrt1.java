/******************************************************************************
 *  Purpose: To calculate the square root by using the method overriding.
 *  @author  Andre Pranali
 *  @version 1.31
 *  @since   16-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
public class sqrt1 {
	public static double sqrt(double c)
	{   
	double t=c;
	double epsilon = 1e-15;
	
	while(Math.abs(t - c/t) > epsilon*t)
	{  		
		   t = (c/t + t) / 2.0;
		   
	}
		 System.out.println("answer is:"+t);
		 return t;
	}
      
	
	public static double sqrt(double c,double epsilon)
	{
		double t=c;
		
		while(Math.abs(t - c/t) > epsilon*t)
		{  		
			   t = (c/t + t) / 2.0;
			   
		}
		System.out.println("answer is:"+t);
		return t;
	}
	
	public static void main(String[] args) {
		double c=Double.parseDouble(args[0]);
		double epsilon = 1e-15;
		 sqrt(c);
		 sqrt(c,epsilon);
		
		
	}

}
