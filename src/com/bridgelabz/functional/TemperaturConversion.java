/******************************************************************************
 *  Purpose: the purpose of calculate the temperature of fahrenheit and celcius. 
 *  @author  Andre Pranali
 *  @version 1.0
 *  @since   3-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TemperaturConversion {
	
	public static void main(String[] args)
	{

        Scanner scanner = new Scanner(System.in);
 
        // Converting Fahrenheit to Celsius
        System.out.println("Enter temperature in Fahrenheit :");
        float temperatue = scanner.nextFloat();
        float celsius = Utility.toCelsius(temperatue);
        System.out.printf("%.02f degree fahrenheit temperature is equal to %.02f degree celsius %n", temperatue, celsius);
 
        // Converting Celsius to Fahrenheit
        System.out.println("Enter temperature in degree celsius :");
        temperatue = scanner.nextFloat();
        float fahrenheit = Utility.toFahrenheit(temperatue);
        System.out.printf("%.02f degree celsius is equal to %.02f degree fahrenheit %n", temperatue, fahrenheit);
		
		
		
	}

}