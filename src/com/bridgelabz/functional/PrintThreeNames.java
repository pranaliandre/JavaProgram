/***************************************************************************************************************************************
 *  Purpose: To the purpose of three names as input and prints out a proper 
 *            sentence with the names in the reverse of the order given.
 *
 *  @author  Andre Pranali
 *  @version 1.0
 *  @since   31-07-2019
 *
 **************************************************************************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
 
public class PrintThreeNames
{
    
     
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Enter The three names :");
        String inputString = scanner.nextLine();
       
         
        String outputString = Utility.reverseTheSentence(inputString);
       
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("Output String : "+"Hii"+" "+outputString);
         
       scanner.close();
    }
}










