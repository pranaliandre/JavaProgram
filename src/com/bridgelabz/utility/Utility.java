/******************************************************************************
 *  Purpose: To reused the code.
 *
 *  @author  Andre Pranali
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/


package com.bridgelabz.utility;

public class Utility 
{
	/**
	 * @param firstnumber:  first integer number.
	 * @param secondnumber: second integer number.
	 * @return :            Addition of first number and second number.
	 */
	public static int add(int firstnumber, int secondnumber)
	{
		int sum = firstnumber+secondnumber;
		return sum;
	}
	
	/********************************************************************************************************************************************
	 * @param inputString: It is a input string.
	 * @return:            Reverse the word of sentence.
	 ********************************************************************************************************************************************/
	public static String reverseTheSentence(String inputString)
    {
        String[] words = inputString.split("\\s");
         
        String outputString = "";
         
        for (int i = words.length-1; i >= 0; i--)
        {
            outputString = outputString + words[i] + " ";
        }
         
        return outputString;
    }
	
	
	
    /********************************************************************************************************************************************************************************************************************************
     * @param year Accept the year as a parameter
     * 
     *******************************************************************************************************************************************************************************************************************************/
    public static void leap(int year) {


		if(year>=1582 && year<10000)   
	         	 { 

	        boolean flag=true;
			if(year % 400 == 0)
	        {
	            flag = true;
	        }
	        else if (year % 100 == 0)
	        {
	            flag = false;
	        }
	        else if(year % 4 == 0)
	        {
	            flag = true;
	        }
	        else
	        {
	            flag = false;
	        }
	        if(flag)
	        {
	            System.out.println("Year "+year+" is a Leap Year");
	        }
	        else
	        {
	            System.out.println("Year "+year+" is not a Leap Year");
	        }
	       		} 

				else
				{
	                            System.out.println("Year should be less than 1582");			
				}
	    }
	
    
    /******************************************************************************************************
     * @param a:     First integer number.
     * @param b:     Second integer number.
     * @param c:     Third integer number.
     * @param num:   It takes no. of oprations.
     * @param value: Returning the ans.
     * @return       To Return the ans in value variable.
     ******************************************************************************************************/
    public static int integeropt(int a, int b, int c, int num,int value)
	{
		
		if(num==1)
		{
			value=a + b *c;
		
		}

		if(num==2)
		{
			value=a * b + c;
		
		}
		if(num==3)
		{
			value=c + a / b;
		
		}
		if(num==4)
		{
			value=a % b + c;
		
		}
		return value;
	}
	
    
    /**********************************************************************************************************************************************
     * @param a:       First integer number.
     * @param b:       Second integer number.
     * @param c:       Third integer number.
     * @param num:     It takes no. of oprations.
     * @param value:   Returning the ans.
     * @return:        To Return the ans in value variable.
   
  

    
 
     *********************************************************************************************************************************************/
    public static double doubleopt(double a, double b, double c, double num,double value)
   	{
   		
   		if(num==1)
   		{
   			value=a + b *c;
   		
   		}

   		if(num==2)
   		{
   			value=a * b + c;
   		
   		}
   		if(num==3)
   		{
   			value=c + a / b;
   		
   		}
   		if(num==4)
   		{
   			value=a % b + c;
   		
   		}
   		return value;
   	}
    
    /**************************************************************************************************************************************************************************************************************
     * @param m: accepting month.
     * @param d: Accepting date.
     *************************************************************************************************************************************************************************************************************/
    public static void spring(int m, int d)
    {

		
    	if(m>=3 &&  m<=6 || d>=20 && d<=20)
    	{
    	if(m==3)
    	{
    		System.out.println("march");
    	}
    	if(m==6)
    	{
    		System.out.println("June");
    	}
    	
    		System.out.println("True");
    		
    	}
    	else{
    		
    		System.out.println("false");
    	}
    	
    }
	
}
