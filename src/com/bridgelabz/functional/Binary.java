/******************************************************************************
 *  Purpose: To calculate the decimal number to binary number.
 *
 *  @author  Andre Pranali
 *  @version 1.26
 *  @since   11-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

public class Binary {

	public static void main(String[] args) {

		int a=0,count = 0;
		String x="";
		int n=Integer.parseInt(args[0]);
		
			while(n>0)
			{	
				
			 a=n%2;
				if(a==1)
				{
				
					count++;
				}
			x=x+" "+a;
			n=n/2;
			}

		
		System.out.println("Binary number are"+x);
		System.out.println("no. of 1s count:"+count);
	}
	

}
