package com.bridgelabz.lib;

import com.bridgelabz.utility.Utility;

public class Stopwatch {

	public static void main(String[] args) {
		
		System.out.println("Enter the start time");
		int start=Utility.integervalue();
		
	 int starttime=0;
	 int stoptime=0;
	 
	 
	 if(start==0)
	 {
		 starttime=(int) (System.currentTimeMillis());
		
	 }
		
	 System.out.println("enter 1 calculating the elapse time");
	 int stop=Utility.integervalue();

     if(stop==1)
     {
    	stoptime = (int) System.currentTimeMillis();
	    int Elapsedtime=(stoptime-starttime)/1000;
        System.out.println(Elapsedtime);
     }
	}

}



