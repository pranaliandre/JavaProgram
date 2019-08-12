
/******************************************************************************
 *  Purpose: To calculate the happy number.
 *
 *  @author  Andre Pranali
 *  @version 1.22
 *  @since   9-08-2019
 *
 ******************************************************************************/package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class happyNumber {
public static void main(String[] args) {
	
	System.out.println("Enter the number:");
	int num=Utility.integervalue();
	
	int s=num;
	while(s>9)
	{
		s=Utility.happy(s);
	}
	if(s==1)
	{
		
		System.out.println("happy number:");
	}
	else
		System.out.println("unhappy number");
}

}
