/******************************************************************************
 *  Purpose: To calculate the day of week.
 *  @author  Andre Pranali
 *  @version 1.11
 *  @since   2-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		
        int d, m, y;
		d = Integer.parseInt(args[0]);
		m = Integer.parseInt(args[1]);
		y = Integer.parseInt(args[2]);
		int result=Utility.week(d, m, y);
		
		System.out.println("result is:");
		System.out.println(result);
	}
	
}
