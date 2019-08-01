/******************************************************************************
 *  Purpose: to calculate the integer number operations.
 *
 *  @author  Andre Pranali
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class IntOpt {

    public static void main(String args[])
    {
    	int a,b,c,value = 0,num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        a=scanner.nextInt();
        
        System.out.print("Enter the value of b:");
        b=scanner.nextInt();
        
        System.out.print("Enter the value of c:");
        c=scanner.nextInt();
                                        
        System.out.println("1.a + b *c"); 
        System.out.println("2.a * b + c"); 
        System.out.println("3.c + a / b");
        System.out.println("4.a % b + c");
        System.out.println("enter the no of operation");
        num=scanner.nextInt();
       
     
		value=Utility.integeropt(a, b, c, num, value);
		System.out.print(value);

        scanner.close();
    }
}




	
	