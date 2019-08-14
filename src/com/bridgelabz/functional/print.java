/******************************************************************************
 *  Purpose: To print f.
 *  @author  Andre Pranali
 *  @version 1.19
 *  @since   14-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

public class print {



	    public static void main(String args[]) {
      
	        int row; 
	        int column; 

	        for (row = 1; row <= 9; row++) {
	            if (row == 1 || row == 5)
	                for (column = 1; column <= 5; column++) {
	                    if (column == 1 || column ==5)
	                        System.out.print("*");
	                }
	            System.out.print("*");
	          
	            System.out.println();
	        }
	        System.exit(0);
	    }
	}