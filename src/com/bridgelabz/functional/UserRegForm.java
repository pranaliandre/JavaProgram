package com.bridgelabz.functional;



	import java.util.Scanner;

	public class UserRegForm
	{

	public static void main(String[] args)
	{

	Scanner sc=new Scanner(System.in);
	String Name;
	String Email;
	String phone_number;
	String ComName;
	String UserId;
	String pass;
	        int i;

	/*Code For Validating Usename*/
	System.out.println("\n Enter name of user-:");
	Name=sc.next();
	if(Name!=null&& Name.matches("^[a-zA-Z]*$")&&Name!=("^1-9"))
	{

	System.out.println("\n UsersName->"+Name);

	   }
	else
	{

	System.out.println("\n Username Should Not contain Numbers");

	System.exit(0);

	}


	/*Code For Validating E mail id*/

	System.out.println("\n Enter Valid Email id");
	Email=sc.next();
	if(Email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$"))
	{

	System.out.println("\n Email_id->"+Email);
	}
	else
	{
	System.out.println("\n Enter valid Email Addres");
	System.exit(0);
	}


	/*Code For Validating Phone number*/

	System.out.println("\n Enter Phone number:");
	phone_number=sc.next();

	      if( ( phone_number.matches("^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$\n" + 
	      		"\n" + 
	      		"")))
	      {
	     
	           System.out.println("\n Phone Number="+phone_number);
	     
	      }
	      else
	      {
	      System.out.println("\n Enter valid phone number");
	      }
	     
	     
	      /*Code For Validating Company name*/
	     
	      System.out.println("\n enter Company name-:");
	      ComName=sc.next();
	      System.out.println("\n Company Name="+ComName);
	     
	     
	      /*Code For Validating UserID*/
	      /*User
	     
	     
	     
	      System.out.println("\n Enter userID:");
	UserId=sc.next();

	if(UserId.matches("[a-zA-Z0-9\\._\\-]{3,}"))
	{

	System.out.println("\n Your UserId=:"+UserId);

	}
	else
	System.out.println("\n Enter valid format of user id");


	/*Code For Validating Password*/

	          System.out.println("\n Enter Password:");
	    pass=sc.next();
	    if(pass.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"))
	    {
	    }
	    else {
	System.out.println("enter valid password");
	}

	}
	}