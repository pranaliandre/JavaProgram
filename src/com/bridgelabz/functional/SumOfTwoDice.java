/******************************************************************************
 *  Purpose: To calculate the sum of two random dice number.
 *  @author  Andre Pranali
 *  @version 1.8
 *  @since   2-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class SumOfTwoDice {
	
	public static void main(String[] args) {
		int firstvalue, secondvalue;
		firstvalue = (int) (Math.random() * 6 + 1);
		System.out.println("First random value"+firstvalue);
        secondvalue =(int) (Math.random() * 6 + 1 );
        System.out.println("Second random value"+secondvalue);
		
		int result=Utility.dice(firstvalue, secondvalue);
		System.out.println("result id:"+result);
	}

}
