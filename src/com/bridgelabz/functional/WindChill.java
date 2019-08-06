/******************************************************************************
 *  Purpose: To purpose of calculate the Windchill.
 *  @author  Andre Pranali
 *  @version 1.10
 *  @since   2-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		System.out.println("temperature is:");
		double temperature =Utility.doublevalue();
		
		System.out.println("Speed is");
		double speed = Utility.doublevalue();
		
		double chill1= Utility.chill(temperature, speed);
		System.out.println("Windchill"+chill1);
}
}