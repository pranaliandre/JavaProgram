/******************************************************************************
 *  Purpose: to calculate  the Year is a Leap Year or not a Leap Year.
 *  @author  Andre Pranali
 *  @version 1.2
 *  @since   31-07-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

//import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	
	
	    public static void main(String args[])
	    {
	       // Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter any year:");
	        int year =Utility.integervalue();
	        Utility.leap(year);
//scanner.close();
	    }
	}


