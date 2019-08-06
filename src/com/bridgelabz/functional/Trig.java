/******************************************************************************
 *  Purpose: Calculate the various trignometric function. 
 *  @author  Andre Pranali
 *  @version 1.14
 *  @since   3-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Trig {

	public static void main(String[] args) {
	
		double degree;
		System.out.println("Enter the value for degree");
		degree=Utility.doublevalue();
		
	
		double radian=Utility.trignometric(degree);
		System.out.println("the radian value is:");
		System.out.println(radian);

	}

}
