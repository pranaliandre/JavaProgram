package com.bridgelabz.functional;

public class pascal {


		public static void main(String[] args) {
		int num=5;
		for(int i=0;i<num;i++)
		{
			for(int j=num;j>i;j--)
			{
				 System.out.print("");
			}
		

			int val=1;

			for(int k=0;k<=i;k++)
			{
				System.out.print(val+"");
				val=val*(i-k)/(k+1);
			}	
			System.out.println();
		}
		}
	}