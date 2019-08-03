/******************************************************************************
 *  Purpose: to calculate the root quadratic equation.
 *  @author  Andre Pranali
 *  @version 1.0
 *  @since   2-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args)
	{
		double a,b,c;
		
		System.out.println("First value a:");
		a=Utility.doublevalue();
		
		System.out.println("First value b:");
		b=Utility.doublevalue();
		
		System.out.println("First value c:");
		c=Utility.doublevalue();
		Utility.root(a,b,c);
		
	}
}
