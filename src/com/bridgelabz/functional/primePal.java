package com.bridgelabz.functional;
import java.util.*; 
  
class primePal { 
     
		 public static void main(String[] args) {
		 System.out.println("Prime Palindrome Number Between 1-100");
		 boolean isPrime;
		 int rem, temp, reversed;
		 for (int number = 1; number <= 100; number++) {
		 isPrime = true;
		 if (number >= 2) {
		 for(int i = 2; i <= (number/2) ; i++){
		 if((number % i) == 0)
		 isPrime = false;
		 }
		 if (isPrime) {
		 temp = number;
		 reversed = 0;
		 while (temp != 0) {
		 rem = temp % 10;
		 reversed = (reversed * 10) + rem;
		 temp /= 10;
		 }
		 if (reversed == number) {
		 System.out.print(number + " ");
		 }
		 }
		 }
		 }
		 System.out.println();
		 } 
		}