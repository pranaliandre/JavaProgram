/******************************************************************************
 *  Purpose: To return the min max from array of string in a paramere.
 *  @author  Andre Pranali
 *  @version 1.30
 *  @since   14-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class minMaxMathFunction {

public static void main(String [] args){

	int a[]=new int[]{4,2,5,7,8,9};
	int min=a[0];
	int max=a[0];
	for(int i=0;i<=5;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}
		if(min>a[i])
		{
			min=a[i];
		}
	}
	System.out.println("Largest Number is:"+max);
	System.out.println("Smallest Number is:"+min);

}
}















