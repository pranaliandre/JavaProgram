/******************************************************************************
 *  Purpose: to calculate Euclidean distance.
 *  @author  Andre Pranali
 *  @version 1.6
 *  @since   2-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Distance {
	public static void main(String []args)
	{
		System.out.println("Enter need a two number");
		System.out.println("Enter value of x");
		double x=Utility.integervalue();
		
		System.out.println("Enter valure of y:");
		double y=Utility.integervalue();
		
		Utility.Euclidean(x,y);
		
	}


}
