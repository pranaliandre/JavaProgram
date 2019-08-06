/******************************************************************************
 *  Purpose: To calculatethe square root.
 *  @author  Andre Pranali
 *  @version 1.18
 *  @since   6-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Sqrt {

	public static void main(String[] args) {
    double c=Double.parseDouble(args[0]);
	double epsilon = 1e-15;
    double  t=c;
	 t=Utility.squareroot(t, epsilon, c);
	System.out.println("answer is:"+t);
	}

}
