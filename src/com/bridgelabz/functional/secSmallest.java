
/******************************************************************************
 *  Purpose: To find second smallest and second largest .
 *  @author  Andre Pranali
 *  @version 1.20
 *  @since   6-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;


import com.bridgelabz.utility.Utility;

public class secSmallest {
	public static void main(String[] args)
	{
		int i = 0,n = 0;
		System.out.println("Enter the no. of element minimum two:");
		n = Utility.integervalue();
		System.out.println("enter the all element: ");
		int a[]=new int [n];
		for(i=0;i<n;i++)
		{
				a[i]=Utility.integervalue();
		}
		  
		System.out.println("largest value"+a[n-2]);
		System.out.println("Smallest:"+a[1]);
		Utility.largest(i,n);
}
}
