/******************************************************************************
 *  Purpose:  calculate the monthly payment over the year.. 
 *  @author  Andre Pranali
 *  @version 1.0
 *  @since   2-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class CarLoan {

	public static void main(String[] args) {
	 double principle,year,rate;
	 
	 principle =Double.parseDouble(args[0]);
	 year=Double.parseDouble(args[1]);
	 rate=Double.parseDouble(args[2]);
	 
	 double result=Utility.loan(principle, year,rate);
	System.out.println("result is"+result);
	}

}
