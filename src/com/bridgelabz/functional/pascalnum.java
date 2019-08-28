package com.bridgelabz.functional;

public class pascalnum {
	public static void main(String[] args) {
		
	
	int row = 5;
	for(int i=0;i<row;i++)
	{
	
		for(int j=row;j>i;j--)
		{
			System.out.print(" ");
		}
		int val=1;
		for(int k=0;k<=i;k++)
		{
			System.out.print(val+" ");
			val=val*(i-k)/(k+1);
		
		}
		System.out.println();
	}

}
}
