/******************************************************************************
 *  Purpose: To calculate Addition of two integer numbers.
 *
 *  @author  Andre Pranali
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

//import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Addition 
{
	public static void main(String[] args)
	{
		//Utility  utility = new Utility();
		//Scanner scanner = new Scanner(System.in);
		//int firstnumber, secondnumber, result;
		
		System.out.println("we need two numbers:");
		System.out.println("Enter your first number:");
		int firstnumber=Utility.integervalue(); 
		//firstnumber = scanner.nextInt();
		
		System.out.println("Enter your second number:");
		int secondnumber=Utility.integervalue(); 
		//secondnumber = scanner.nextInt();
		
		int result = Utility.add(firstnumber,secondnumber);
		System.out.println("Addition of two numbers:"+result);
		System.out.println("welcome");
		//scanner.close();
	}
}


//https://github.com/mukesh093/bridgelabz/tree/master/stock