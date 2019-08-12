/******************************************************************************
 *  Purpose: To simulate the gambler.
 *  @author  Andre Pranali
 *  @version 1.21
 *  @since   9-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class GamblerSimulator {

	public static void main(String[] args) {
	int stake,goal,number;
	
	System.out.println("Enter your stake");
	stake=Utility.integervalue();
			
	System.out.println("Enter your goal");
	goal=Utility.integervalue();
	
	System.out.println("Enter the number");
	number=Utility.integervalue();
	
	Utility.gambler(stake,goal,number);
	}

}
