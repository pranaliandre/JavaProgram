/******************************************************************************
 *  Purpose: To calculate Addition of two integer numbers.
 *
 *  @author  Andre Pranali
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Addition 
{
	public static void main(String[] args)
	{
		//Utility  utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		int firstnumber, secondnumber, result;
		
		System.out.println("we need two numbers:");
		System.out.println("Enter your first number:");
		firstnumber = scanner.nextInt();
		
		System.out.println("Enter your second number:");
		secondnumber = scanner.nextInt();
		
		result = Utility.add(firstnumber,secondnumber);
		System.out.println("Addition of two numbers:"+result);
		scanner.close();
	}
}
