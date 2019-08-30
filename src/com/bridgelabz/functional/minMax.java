package com.bridgelabz.functional;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class minMax {

	

	

	public static void main(String[] args)
	{

	       try {
	           Scanner file = new Scanner(new File("/home/admin1/Desktop/JavaProgram/JavaProgram/src/com/bridgelabz/functional/number"));
	           int largest = file.nextInt();
	           int smallest=file.nextInt();

	           while(file.hasNextInt()) {
	               int number = file.nextInt();

	               if(number > largest) {
	                   largest = number;
	               }
	               else if(number < smallest)
	               {
	                smallest=number;
	               }
	             
	               
	           }
	           file.close();
	           System.out.println("The biggest number in the file is: " + largest);
	           System.out.println("The smallest number in the file is: " + smallest);
	           
	           try {
	            File file1 = new File("/home/admin1/Desktop/JavaProgram/JavaProgram/src/com/bridgelabz/functional/numberout");
	               PrintWriter output = new PrintWriter(file1);
	               output.printf("maximum: %d\n",largest);
	               output.printf("minimum: %d\n",smallest);
	               output.close();
	           } catch (FileNotFoundException e)
	           {
	               System.out.println(e.getMessage());
	           }
	       }
	       catch(IOException e)
	       
	       {
	           System.out.println(e.getMessage());
	       }
	   }

	}

