/******************************************************************************
 *  Purpose: To calculate the sin value.
 *
 *  @author  Andre Pranali
 *  @version 1.29
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

public class sin {


public static class Sin {

    public static void main(String[] args) { 
        double x = Double.parseDouble(args[0]);

   
        x = x % (2 * Math.PI);

    
        double term = 1.0;      
        double sum  = 0.0;     

        for (int i = 1; term != 0.0; i++) {
            term *= (x / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }
        System.out.println(sum);
    }
}
}
