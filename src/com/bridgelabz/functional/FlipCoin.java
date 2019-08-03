/******************************************************************************
 *  Purpose: calculate the head percentage of head and tail.
 *  @author  Andre Pranali
 *  @version 1.0
 *  @since   3-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class FlipCoin {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter amount of times you want the coin to be tossed :");
		int times=Utility.integervalue();
		
		Utility.flipcoin(times);
		
		}
		
	}


