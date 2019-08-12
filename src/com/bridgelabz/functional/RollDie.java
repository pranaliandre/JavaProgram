package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class RollDie {
    public static void main(String[] args) {
    	int n = 0;
    	int i;
    //	System.out.println("Enter the number:");
     //   n=Utility.integervalue();
	
    		//System.out.println("enter the no. you want rolldie:");
    		//n=Utility.integervalue();
    	
    	int SIDES = 6;
     	int rolldie = (int) (Math.random() * SIDES) + 1;
     		System.out.println(rolldie);
    		
    	
	
    }
}