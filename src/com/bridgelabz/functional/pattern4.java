package com.bridgelabz.functional;

public class pattern4 {
public static void main(String[] args)
{
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}System.out.println();
	}
	for(int i=1;i<=4-1;i++)
	{
		for(int j=4-1;j>=i;j--)
		{
			System.out.print("*");
		}
		//for(int k=1;k<=i;k++)
		//{
		//	System.out.print(" ");
		//}
	System.out.println();
	}

}
}