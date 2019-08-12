
/******************************************************************************
 *  Purpose: To print the star pyramid .
 *  @author  Andre Pranali
 *  @version 1.27
 *  @since   11-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class pyaramid {

    public static void main(String[] args) {
    	System.out.println("Enter the value of row:");
    	int rows=Utility.integervalue();
        //int rows = 3;
        int  k = 0;
        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int j = 1; j <= rows - i; ++j) {
                System.out.print("  ");
            }
           while(k != 2 * i - 1) {
            
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}