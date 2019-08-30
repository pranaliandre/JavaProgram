package com.bridgelabz.lib;
import com.bridgelabz.utility.Utility;
import java.util.Arrays; 

  
public class stringfunction {
	
	
	//To check wheather two strings are anagram or not
	public static boolean areAnagram(char[] str1, char[] str2) 
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
    
	//To check wheather strings is palindrome or not
	public static boolean palindrome(String inputstring)
	{
		String reverse="";
		 int length = inputstring.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + inputstring.charAt(i);  
	      if (inputstring.equals(reverse))  
	         System.out.println("Entered string is a palindrome.");  
	      else  
	         System.out.println("Entered string isn't a palindrome.");
		return true;
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
        char str1[] = { 'h', 'e', 'a', 'r' , 't' }; 
        char str2[] = { 'e', 'a', 'r', 't', 'h' }; 
        if (areAnagram( str1, str2)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other"); 
        System.out.println("***To check whether given string is palindrome or not***");
        System.out.println("Enter the input string");
        String   inputstring=Utility.stringvalue();
      	palindrome(inputstring);
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
