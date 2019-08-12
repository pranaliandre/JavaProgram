
/******************************************************************************
 *  Purpose: To print star pyramid .
 *  @author  Andre Pranali
 *  @version 1.25
 *  @since   11-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

public class starPyramid {
public static void main(String[] args)
{

	int row,space,star;
	for(row=1;row<=3;row++)
	{
		for(space=2;space>=row;space--)
		{
			System.out.print("  ");
		}
		for(star=1;star<=(2*row-1);star++)
		{
			System.out.print("* ");
		}
		System.out.println(" ");
	}
}

}