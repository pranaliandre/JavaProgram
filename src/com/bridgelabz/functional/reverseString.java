
/******************************************************************************
 *  Purpose: To make the reverse string .
 *  @author  Andre Pranali
 *  @version 1.26
 *  @since   11-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

public class reverseString {
	
	public static void main(String[] args)
	{

		String str = "how are you";
		System.out.println("reverse string is:"+str);
		int i=str.length();
	
	while(i>0)
	{
		System.out.println(str.charAt(i-1));
		i--;
	}
}
}