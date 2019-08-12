/******************************************************************************
 *  Purpose: To swapping the two nibbles.
 *
 *  @author  Andre Pranali
 *  @version 1.27
 *  @since   11-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class swappingNibbles { 
	 
		// Driver code 
		public static void main(String arg[]) 
		{ 
			int swapNibbles;
			System.out.println("Enter the value");
		    int x =Utility.integervalue(); 
		    int result=Utility.swapNibbles(x); 
		    System.out.println("decimal no is:"+result);
		} 
		
		 

}

