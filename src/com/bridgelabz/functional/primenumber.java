/******************************************************************************
 *  Purpose: To find the prime number.
 *  @author  Andre Pranali
 *  @version 1.19
 *  @since   6-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class primenumber
{
	public static void main(String args[])
	{
		// initialize and declare here.
		int s1, s2;
		System.out.print("Enter the lower limit : "); 
		s1=Utility.integervalue();
		System.out.print("Enter the upper limit :"); 
		s2 = Utility.integervalue();
		System.out.println("Prime numbers between given range are :");
		Utility.prime(s1,s2);
	}
}