package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class pattern6 {

	public static void main(String[] args)
	{
		
	System.out.println("Enter your no.:");
	int n=Utility.integervalue();
	for(int i=1;i<=n;i++)
	{
		for(int j=n;j>=i;j--)
		{
			System.out.print(" ");
		}for(int k=1;k<=i;k++)
		{
			System.out.print("* ");
		}System.out.println();
	
	}
	

	for(int i=n-1;i>=1;i--)
	{
		for(int j=1;j<=n-1;j--)
		{
			System.out.print(" ");
			
		}
	
		for(int k=1;k<=n-i;k++)
		{
			System.out.print("*");
		
		}
		
	System.out.println();
	
	}
	
	
	
	
}
}

