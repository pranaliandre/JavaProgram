/******************************************************************************
 *  Purpose: To calculate Powers of 2 that are less than 2.
 *  @author  Andre Pranali
 *  @version 1.21
 *  @since   7-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class PowerOf2 {


     public static void main(String[] args)
     {
 
            int n=Integer.parseInt(args[0]);
          
            System.out.println("Powers of 2 that are less than 2^"+n);
            int i = 0;
			Utility.power(i,n);
          
        }
}