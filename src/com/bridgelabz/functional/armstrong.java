/******************************************************************************
 *  Purpose: To calculate the armstrong number.
 *  @author  Andre Pranali
 *  @version 1.0
 *  @since   8-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;
public class armstrong {

public static void main(String[] args) {
	
	System.out.println("Enter the number:");
	int n=Utility.integervalue();
	
	
	int s=n;
	
		s=Utility.armStrong(s);

	if(s==n)
	{
		
		System.out.println("Armstrong number");
	}
	else
		System.out.println("Not a Armstrong number");
}

}
