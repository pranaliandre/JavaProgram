/******************************************************************************
 *  Purpose: To calculate the factor of prime number.
 *  @author  Andre Pranali
 *  @version 1.23
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class factorization {
	public static void main(String args[])
	{
		System.out.println("Enter a number:");
		int number=Utility.integervalue();
		Utility.factor(number);
	}

}
