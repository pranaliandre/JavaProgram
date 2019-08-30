package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class middle {
	public static void main(String[] args)
	{int n;
		System.out.println("enter your string");
		String string=Utility.stringvalue();
		int length=string.length();

		int firstchar=0;
		
		int lastchar=length-1;
		int mid=firstchar+lastchar/2;
		for(int i=0;i<=string.length()-1;i++)
		{
			System.out.println(string.charAt(mid));
			mid++;
		}
	
		
	}
}

