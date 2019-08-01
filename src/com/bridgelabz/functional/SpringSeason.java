/******************************************************************************
 *  Purpose: To purpose of calculate spring season month.
 *
 *  @author  Andre Pranali
 *  @version 1.0
 *  @since   1-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SpringSeason {
	public static void main(String[] args)
	{
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the month:");
		int m = Scanner.nextInt();
		System.out.println("entr the date:");
		int d = Scanner.nextInt();
		Utility.spring( m,d);
		Scanner.close();
	}

}


