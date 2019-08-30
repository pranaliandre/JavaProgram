package com.bridgelabz.functional;

import java.util.Random;
import java.util.Scanner;

public class repeatedNumber {
    
    public static void main(String[] args)  
    {	
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lenth of array : ");
        int number=sc.nextInt();
        int arrayRepeated[]=new int[number];
        Random random=new Random();
    
    	 
         int size = 0;
         int value;
	      
	        for(int i=0;i<arrayRepeated.length;i++)
	        {
	        value=1+random.nextInt(arrayRepeated.length);
	        arrayRepeated[i]=value;
	        }
	        for(int i=0;i<arrayRepeated.length;i++)
	        {
	       
	        System.out.print(arrayRepeated[i]+" ");
	        }
         
         
         
         
	        System.out.println("\nRepeated Elements are :\n"); 
	        int count=0;
 		for (int i = 0; i <arrayRepeated.length ; i++)  
         { 
             for (int j = i + 1; j < arrayRepeated.length; j++)  
             { 
                 if (arrayRepeated[i]== arrayRepeated[j] && i!=j )  
                     System.out.print(arrayRepeated[i] + " "); 
           
                 count++;
             } 
             if(count==1) {
     	     //  System.out.print(arrayRepeated[i]);
     	           i++;
     	           count=0;
     	        }
         }
 	   }
    	}

