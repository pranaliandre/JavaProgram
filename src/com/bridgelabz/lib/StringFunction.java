/******************************************************************************
 *  Purpose: To find the different string function.
 *
 *  @author  Andre Pranali
 *  @version 1.28
 *  @since   13-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
//import java.io.*; 
import java.util.Arrays; 
//import java.util.Collections; 

import com.bridgelabz.utility.Utility;
  
public class StringFunction {
    //Anagram
    static boolean areAnagram(char[] str1, char[] str2) 
    { 
    	
        int n1 = str1.length; 
        int n2 = str2.length; 
  
        if (n1 != n2) 
            return false; 
  
    
        Arrays.sort(str1); 
        Arrays.sort(str2); 
  
        for (int i = 0; i < n1; i++) 
            if (str1[i] != str2[i]) 
                return false; 
  
        return true; 
    } 
  
    
    
    
    
    //to check the string is palindrome or not
   
    public static boolean palindrome(String inputString)
    {	int length = 1;
		length=inputString.length();
    	int i,begin,middle,end;
    	
    	begin=0;
		end=length-1;
    	middle=(begin+end)/2;
    	for(i=begin;i<=middle;i++)
    	{
    		if(inputString.charAt(begin)==inputString.charAt(end))
    		{
    			begin++;
    			end--;
    		}
    		else
    		{
    		   break;
    		}
    
    	}
 	if (i == middle+1)
 		
 		 {  
 			System.out.println("Palindrome");
         }
          else 
          {
            System.out.println("Not a palindrome");
          }
          return true;
    }
    //another method of palindrom
          
          public static void palin(String original)
          {
        	         	  String reverse = ""; 
          int length = original.length();
		     
	      for (int i = length - 1; i >= 0; i--)
	         reverse = reverse + original.charAt(i);
	         
	      if (original.equals(reverse))
	         System.out.println("The string is a palindrome.");
	      else
	         System.out.println("The string isn't a palindrome.");
          }
    
    

    
          

      	// To find Permutatio of string using recursion
      			public static void permute(String str, int l, int r) 
      	    { 
      	        if (l == r) 
      	            System.out.println(str); 
      	        else
      	        { 
      	            for (int i = l; i <= r; i++) 
      	            { 
      	                str = swap(str,l,i); 
      	                permute(str, l+1, r); 
      	               str = swap(str,l,i); 
      	            } }
      	        }
      	            public static String swap(String a, int i, int j) 
      		        { 
      		            char temp; 
      		            char[] charArray = a.toCharArray(); 
      		            temp = charArray[i] ; 
      		            charArray[i] = charArray[j]; 
      		            charArray[j] = temp; 
      		            return String.valueOf(charArray); 
      		        } 
      	            
    
      	            
      	          
    	            //To find permution of string using iterartion
    	            private static void swap(char[] arr, int i, int j) {
    	        		char c = arr[i];
    	        		arr[i] = arr[j];
    	        		arr[j] = c;
    	        	}

    	        	// Utility function to reverse a char array between specified indexes 
    	        	private static void reverse(char[] arr, int i, int j)
    	        	{
    	        		// do till two end-points intersect
    	        		while (i < j) {
    	        			swap(arr, i++, j--);
    	        		}
    	        	}

    	        	// Iterative function to find permutations of a String in Java
    	        	public static void permutations(String str, int n)
    	        	{
    	        		// sort the string in natural order
    	        		char[] s = str.toCharArray();
    	        		Arrays.sort(s);

    	        		while (true)
    	        		{
    	        			// Print current permutation
    	        			System.out.print(String.valueOf(s) + " ");

    	        			/* Below code will rearrange the string to next lexicographically
    	        			 ordered permutation (if any) or return if we are already at
    	        			 highest possible permutation */

    	        			// Find largest index i such that s[i-1] is less than s[i]
    	        			int i = n - 1;
    	        			while (s[i-1] >= s[i])
    	        			{
    	        				// if i is first index of the string, that means we are 
    	        				// already at last possible permutation 
    	        				// (string is sorted in reverse order)
    	        				if (--i == 0)
    	        					return;
    	        			}

    	        			// find highest index j to the right of index i such that 
    	        			// s[j] > s[iâ€“1] (s[i..n-1] is sorted in reverse order)

    	        			int j = n - 1;
    	        			while (j > i && s[j] <= s[i-1])
    	        				j--;

    	        			// Swap characters at index i-1 with index j
    	        			swap(s, i-1, j);

    	        			// reverse the substring s[i..n-1] and return true
    	        			reverse (s, i, n-1);
    	        		}
    	        	}

    
    public static void main(String args[]) 
    { 
    	//Anagram 
        char str1[] = { 'h', 'e', 'a', 'r' , 't' }; 
        char str2[] = { 'e', 'a', 'r', 't', 'h' }; 
        if (areAnagram(str1, str2)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other"); 
        
        
        
        
        //Check string palindrome or not 
        String inputString ="madm";
		palindrome(inputString);
		
		
        // another method of palindrome
		
		System.out.println("Enter a string to check if it is a palindrome");
		String original = Utility.stringvalue();
		palin(original);
		         
		
		//recurtion of permutation
		System.out.println("***To find permutation of string using recirssion***");
        System.out.println("Enter the input string");
         String   str=Utility.stringvalue(); 
         int n = str.length();  
          permute(str,0,n-1);  
		
          
          
          System.out.println("***To find permutation of string using iterationn***");
          System.out.println("Enter the input string");
          String   s=Utility.stringvalue(); 
  		permutations(s, s.length());
  	//	System.out.println("******");
  		if(String.valueOf(s)==str)
  		{
  			System.out.println("Arrays are equals");
  		}
  			else
  			{
  				System.out.println(" Arraays are not equal");
  			}
		   }
		
    }
    

  