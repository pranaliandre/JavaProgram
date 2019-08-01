/******************************************************************************
 *  Purpose:  to calculate the Double operation..
 *
 *  @author  Andre Pranali
 *  @version 1.0
 *  @since   1-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DoubleOpt {

    public static void main(String args[])
    {
    	double a,b,c,value = 0,num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a=scanner.nextDouble();
        
        System.out.print("Enter the value of b:");
        b=scanner.nextDouble();
        
        System.out.print("Enter the value of c:");
        c=scanner.nextDouble();
        
        System.out.println("1.a + b *c"); 
        System.out.println("2.a * b + c"); 
        System.out.println("3.c + a / b");
        System.out.println("4.a % b + c");
        System.out.println("enter the no of operation");
        num=scanner.nextInt();
       
     
		value=Utility.doubleopt(a, b, c, num, value);
		System.out.print(value);

        scanner.close();
    }
}




	
	