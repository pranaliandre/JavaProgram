package com.bridgelabz.functional;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.utility.Utility;
@SuppressWarnings("unused")
public class emailValidation {



		public static void main(String[] args) {
			

			
			  String email = "pranaliandre06@gmail.com"; 
		        if (isValid(email)) 
		            System.out.print(email); 
		        else
		            System.out.println("Email address is wrong"); 
		  
		        long mobileNo=Utility.integervalue();
		        
		        int number=String.valueOf(mobileNo).length();
		    
		}
		public static boolean isValid(String email) 
	    { 
	        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
	                            "[a-zA-Z0-9_+&*-]+)*@" + 
	                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
	                            "A-Z]{2,7}$"; 
	                              
	        Pattern pat = Pattern.compile(emailRegex); 
	        if (email == null) 
	            return false; 
	        return pat.matcher(email).matches(); 
	    } 

	}
