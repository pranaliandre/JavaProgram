package com.bridgelabz.functional;

import java.util.Random; 

class shuf { 
      
    // Function which shuffle and print the array 
    public static void shuffle(int card[], int n) 
    { 
          
        Random rand = new Random(); 
          
        for (int i = 0; i < n; i++) 
        { 
            // Random for remaining positions. 
            int r = i + rand.nextInt(9 - i); 
              
             //swapping the elements 
             int temp = card[r]; 
             card[r] = card[i]; 
             card[i] = temp; 
               
        } 
    } 
       
    // Driver code 
    public static void main(String[] args)  
    { 
        // Array from 0 to 51 
        int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8}; 
       
        shuffle(a, 9); 
       
        // Printing all shuffled elements of cards 
        for (int i = 0; i < 9; i ++) 
           System.out.print(a[i]+" "); 
          
    } 
} 
// This code is contributed by Arnav Kr. Mandal 