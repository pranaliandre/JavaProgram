package com.bridgelabz.functional;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int number;
		int sum=1;
	
		number = Integer.parseInt(args[0]);
		
		//number=scanner.nextInt();
		for(int i=0;i<number;i++)                                           
		{
			sum=sum*2;
		}
		
		int number1=sum-1;
		System.out.println(number1);
		System.out.println("enter the key");
		int key=scanner.nextInt();
		int first = 0,last =number1;
		int mid=(first+last)/2;
		int count=1;
		 while(count==1&&first<=last) {
		System.out.println("it is your number:"+mid);
		System.out.println("enter the choise:\n1 no is n:\n2:yes than enter y");
		String s=scanner.next();
		char p=s.charAt(0);
		switch (p) {
		case 'n':
			if (mid==key) {
			System.out.println(mid);
			
		}
		else if(mid<key){
			first=mid+1;
			
		}else {
			last=mid-1;
			}
		mid=(first+last)/2;
		break;
		case 'y':
			System.out.println("number is found"+mid);
			count=0;
		break;
	}
		 if(first>last) {
			 System.out.println("not found");
		 }
		 
	}
}
}
