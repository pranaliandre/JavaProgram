package com.bridgelabz.functional;
public class prime {
 
    public static void main(String args[]){
         
        int number = 2;
        int count = 0;
        long sum = 0;
        while(count < 1000){
            if(isPrimeNumber(number)){
                sum += number;
                count++;
            }
            number++;
        }
        System.out.println(sum);
    }
     
    private static boolean isPrimeNumber(int number){
         
        for(int i=2; i<=number-1; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}