/******************************************************************************
 *  Purpose: To reused the code.
 *
 *  @author  Andre Pranali
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/


package com.bridgelabz.utility;
import java.util.Scanner;
public class Utility 
{
	
	
	static  Scanner Scanner = new Scanner(System.in);

	
	/*****************************************************************************************************************
	 * @return: return to the integer value.
	 ****************************************************************************************************************/
	public static int integervalue()
	{
		int integervalue = Scanner.nextInt(); 
		return integervalue;
	}
	/********************************************************************************************************************
	 * @return: return to the double value.
	 *******************************************************************************************************************/
	public static double doublevalue()
	{
		double doublevalue = Scanner.nextDouble(); 
		return doublevalue;
	}
	
	/******************************************************************************************************
	 * @return: return to the string value.
	 *******************************************************************************************************/
	public static String stringvalue()
	{
		String stringvalue = Scanner.next(); 
		return stringvalue;
	}
	
	/******************************************************************************************************
	 * @return: return to the float value.
	 *******************************************************************************************************/
	public static float floatvalue()
	{
		float floatvalue = Scanner.nextFloat(); 
		return floatvalue;
	}
	/*******************************************************************************
	 * @param firstnumber:  first integer number.
	 * @param secondnumber: second integer number.
	 * @return :            Addition of first number and second number.
	 *******************************************************************************/
	public static int add(int firstnumber, int secondnumber)
	{
		int sum = firstnumber+secondnumber;
		return sum;
	}
	
	/********************************************************************************************************************************************
	 * @param inputString: It is a input string.
	 * @return:            Reverse the word of sentence.
	 ********************************************************************************************************************************************/
	public static String reverseTheSentence(String inputString)
    {
        String[] words = inputString.split("\\s");
         
        String outputString = " ";
         
        for (int i = words.length-1; i >= 0; i--)
        {
            outputString = outputString + words[i] + " ";
        }
         
        return outputString;
    }
	
	
	
    /********************************************************************************************************************************************************************************************************************************
     * @param year Accept the year as a parameter
     * 
     *******************************************************************************************************************************************************************************************************************************/
    public static void leap(int year) {


		if(year>=1582 && year<10000)   
	         	 { 

	        boolean flag=true;
			if(year % 400 == 0)
	        {
	            flag = true;
	        }
	        else if (year % 100 == 0)
	        {
	            flag = false;
	        }
	        else if(year % 4 == 0)
	        {
	            flag = true;
	        }
	        else
	        {
	            flag = false;
	        }
	        if(flag)
	        {
	            System.out.println("Year "+year+" is a Leap Year");
	        }
	        else
	        {
	            System.out.println("Year "+year+" is not a Leap Year");
	        }
	       		} 

				else
				{
	                            System.out.println("Year should be less than 1582");			
				}
	    }
	
    
    /******************************************************************************************************
     * @param a:     First integer number.
     * @param b:     Second integer number.
     * @param c:     Third integer number.
     * @param num:   It takes no. of operations.
     * @param value: Returning the ans.
     * @return       To Return the ans in value variable.
     ******************************************************************************************************/
    public static int integeropt(int a, int b, int c, int num,int value)
	{
		if(num==1)
		{
			value=a + b *c;
		
		}

		if(num==2)
		{
			value=a * b + c;
		
		}
		if(num==3)
		{
			value=c + a / b;
		
		}
		if(num==4)
		{
			value=a % b + c;
		
		}
		return value;
	}
    /**********************************************************************************************************************************************
     * @param a:       First integer number.
     * @param b:       Second integer number.
     * @param c:       Third integer number.
     * @param num:     It takes no. of oprations.
     * @param value:   Returning the ans.
     * @return:        To Return the ans in value variable.
   
  

    
 
     *********************************************************************************************************************************************/
    public static double doubleopt(double a, double b, double c, double num,double value)
   	{
   		
   		if(num==1)
   		{
   			value=a + b *c;
   		
   		}

   		if(num==2)
   		{
   			value=a * b + c;
   		
   		}
   		if(num==3)
   		{
   			value=c + a / b;
   		
   		}
   		if(num==4)
   		{
   			value=a % b + c;
   		
   		}
   		return value;
   	}
    
    /**************************************************************************************************************************************************************************************************************
     * @param m: accepting month.
     * @param d: Accepting date.
     * @return 
     *************************************************************************************************************************************************************************************************************/
    public static void spring(int month, int day)
    {
    	
		
    	if(month>=3 &&  month<=6 || day>=20 && day<=20)
    	{
    	if(month==3)
    	{
    		System.out.println("march");
    	}
    	if(month==6)
    	{
    		System.out.println("June");
    	}
    	
    		System.out.println("True");
    		
    	}
    	else{
    		
    		System.out.println("false");
    	}
		
    	
    }
    
    /*************************************************************************************************
     * @param x It takes first distance value.
     * @param y It takes
     * @return  Calculate two Distance value
     ************************************************************************************************/
    public static double Euclidean(double x,double y) {
    	
    	double distance = Math.sqrt(x*x + y*y);
    	System.out.println("distance from("+x+","+y+") to(0,0) = "+distance);
    	System.out.println("power from x to y is:"+Math.pow(x,y));
    return 0;
    }
    
    
    
    /*********************************************************************************
     * @param a: Take first value.
     * @param b: Take second value.
     * @param c: Take third value.
     * @return:  Return Quadratic equation answer. 
     *********************************************************************************/
    public static double root(double a,double b, double c) {
    	double delta = Math.sqrt(b * b - 4 * a * c);
    	double root1 = (-b + delta)/(2*a);
    	double root2 = (-b - delta)/(2*a);
    	
    	
    	System.out.println("The roots of quadratic equation \"a*x*x + b*x + c\" are" + root1 + "and" + root2);
    	return 0;
    }
    
    /******************************************************************************************************************************************************
     * @param firstvalue: It takes first random value.
     * @param secondvalue:It takes second random value.
     * @return:            return the sum of two random value.
     ******************************************************************************************************************************************************/
    public static int dice(int firstvalue, int secondvalue) {
    	
         int sum = firstvalue + secondvalue;
    	return sum;
    }
	/*********************************************************************************************************************
	 * @param firstvalue:   first value.
	 * @param secondvalue:  second value.
	 * @param thirdvalue:   third value.
	 * @param forthvalue    forth value.
	 * @param fifthvalue:   fifth value.
	 * @return:             return average value.
	 *********************************************************************************************************************/
	public static double average(double firstvalue,double secondvalue, double thirdvalue, double forthvalue, double fifthvalue)
	{
		double n=5;
		
		double average = firstvalue+secondvalue+thirdvalue+forthvalue+fifthvalue/n;
    	

		return average;
	}
    
	
	public static double chill(double temperature, double speed) {
		double chill1 = 35.74 + 0.6215*temperature + (0.4275*temperature-35.75)*Math.pow(speed,0.16);
		return chill1;
	}
	
	/****************************************************************************************************
	 * @param d enter day.
	 * @param m enter month.
	 * @param y enter year
	 * @return
	 ***************************************************************************************************/
	public static int week(int d, int m,int y)
	{
			int y0 = y - (14 - m) / 12;
			int x = y0 + y0 / 4 - y0 / 100 + y0/400;
			 int m0 = m + 12 * ((14 - m) / 12) - 2;
			 int d0 =(d + x + 31*m0 / 12) % 7;
				return d0;
	}
  

    /******************************************************************************************************
     * @param celsius: Fahrenheit  to celcius conversion
     * @return return: Result 
     ******************************************************************************************************/
    public static float toFahrenheit(float celsius) {
        float fahrenheit = 9 * (celsius / 5) + 32;
        return fahrenheit;
    }
 
  
    /******************************************************************************************************
     * @param fahrenheit: celcius to ahrenheit conversion
     * @return:           Return result
     *****************************************************************************************************/
    public static float toCelsius(float fahrenheit) {
        float celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
	}
	
    /*****************************************************************************************************
     * @param principle: Takes input for the calculating the payment
     * @param rate:      Takes input for the calculating the payment
     * @param year:      takes input for the calculating the payment
     * @return return:   Result
     ****************************************************************************************************/
    public static double loan(double principle, double rate,double year) {
        double r=rate/(12*100);
        double n = 12* year;
        double  payment = principle * r / 1 - Math.pow( ( 1 + r ) , (- n));
	    return payment;
    }
    
	
    /****************************************************************************************************
     * @param degree: It takes input 
     * @return:       Return result
     ***************************************************************************************************/
    public static double trignometric(double degree) {
    	double radian= Math.toRadians(degree); 
    	double sinvalue=Math.sin(degree);
    	System.out.println("sin(" + degree + ") = " + sinvalue);
    	double cosvalue=Math.cos(degree);
    	System.out.println("cos(" + degree + ") = " + cosvalue);
    	return radian;
	}
	/*****************************************************************************************************
	 * @param times It takes input you want to be tossed.
	 * @return 
	 *****************************************************************************************************/
	public static int flipcoin(int times)
	{
		double heads = 0;
		for(int i=0;i<times;i++)
		{
			if (Math.random() > 0.5)
			{
				heads++;
			}
		}
		System.out.println("heads percentage is " + (float) (heads / times) * 100);
		System.out.println("tails percentage is " + (float) (times - heads) / times * 100);
		return 0;
		
	}
		
	  
	
	/*************************************************************************************************************************
	 * @param i: It takes integer number for calculating power.
	 * @param n: It take number for the calculating power.
	 * @return:  return power.
	 ************************************************************************************************************************/
	public static int power(int i,int n){
		i = 0;
		 int power = 1;
		 while (i <= n)
         {
		
             System.out.println("2^"+i+" = " + power);
             power = power * 2;
             i++;
             
         }
		return power;
		
	}
	
	/**************************************************************************************************************************
	 * @param n: It take number for calculatin the harmoniv number
	 * @return:  Return of value sum. 
	 **************************************************************************************************************************/
	public static double harmonic(double n) {
		double sum = 0.0;
		for(int i=1;i<=n;i++) {
			sum += 1.0 / i ;
		//	i++;
		}
		System.out.println(sum);
		return sum;
		
	}
	/**************************************************************************************************************************
	 * @param t:       It take input from command line argument.
	 * @param epsilon: It take input from command line argument.
	 * @param c        It take input from command line argument.
	 * @return:        Return square root value.
	 ***********************************************************************************************************/
	public static double squareroot(double t,double epsilon,double c)
	{
		while(Math.abs(t - c/t) > epsilon*t)
		{  
			   t = (c/t + t) / 2.0;
		}
		return t;
	}
	
	/*********************************************************************************************************************************************************************************
	 * @param s1: It take input for lower limit.
	 * @param s2: It take input for upper limit.
	 * @return:   Return prime no.
	 ***********************************************************************************************************************************************************************/
	public static int prime(int s1,int s2) {
       
         int i = 0, count = 0,j; 
		for(i = s1; i <= s2; i++)
		{
			for( j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					count = 0;
					break;
				}
				else
				{
					count = 1;
				}
			}
			if(count == 1)
			{
				System.out.println(i);
			}
		}

		return i;
	}
	
	
	


/*****************************************************************************************************************
 * @param i For finding the index position of array.
 * @param n Enter the number of elements you want. 
 *****************************************************************************************************************/
public static void largest(int i,int n) {

	int a[]=new int [n];
int j;


for(i=0;i<n;i++)
{
	for(j = i + 1; j < n; j++)
	{
		if(a[i]>a[j])
		{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
	}
}

}


































/****************************************************************************************************************************************
 * @param arr It takes array for calculating the repeated element. 
 * @param size It takes length
 ***************************************************************************************************************************************/
public static void array(int arr[],int size)
{
	int i,j;
	System.out.println("Repeated elments are:");
for( i = 0; i < size; i++)
{  
       for( j = i + 1; j < size; j++) 
       {  
           if(arr[i] == arr[j])  
               System.out.print(arr[i] + " ");
       }  
 }  
	  
}

/***************************************************************************************************************************************************
 * @param number: It takes number for factorization.
 * @return:       Return result.
 ***************************************************************************************************************************************************/
public static int factor(int number) {
	

		while(number%2==0)
		{
			System.out.println(2 + " ");
			number= number/2;
		}
		//for odd element
		for(int i=3;i<=Math.sqrt(number);i+=2)
		{
			while(number%i==0)
			{
				System.out.println(i+"");
				number=number/i;
			}
		}
			if(number>2)
			{
				System.out.println(number);
			}
	
	return number;
}

/********************************************************************************************************************************************************
 * @param rolldie take input
 * @return
 *******************************************************************************************************************************************************/
public static int roll(int rolldie)
{
int SIDES = 6;
rolldie = (int) (Math.random() * SIDES) + 1;
return rolldie;
// System.out.println(rolldie);
}


/*******************************************************************************************************************************************
* @param n Enter value calculating the happy number or not.
* @return  return check happy numbe5r or not.
*******************************************************************************************************************************************/
public static int happy(int n)
{
int s = 0;
int d;
while(n!=0)
{
	
	d=n%10;
	s=s+d*d;
	n=n/10;
	
}
return s;

}

/**********************************************************************************************************************
* @param n Enter value calculating the armstrong number or not.
* @return  Return armstrong or not.
**************************************************************************************************************************/
public static int armStrong(int n)
{
int s = 0;
int d;
while(n!=0)
{
	
	d=n%10;
	s=s+d*d*d;
	n=n/10;
	
}
return s;

}

/***********************************************************************************************************************
* @param n Enter the value for calculating magic matrix.
***********************************************************************************************************************/
public static void magicSqaure(int n) 
{ 
int[][] magicSquare = new int[n][n]; 
  
int i = n/2; 
int j = n-1; 


for (int num=1; num <= n*n; ) 
{ 
    if (i==-1 && j==n)
    { 
        j = n-2; 
        i = 0; 
    } 
    else
    { 
      
        if (j == n) 
            j = 0; 
              
    
        if (i < 0) 
            i=n-1; 
    } 
      
 
    if (magicSquare[i][j] != 0)  
    { 
        j -= 2; 
        i++; 
        continue; 
    } 
    else
    
        magicSquare[i][j] = num++;  
          

    j++;  i--;  
} 


System.out.println("The Magic Square for "+n+":"); 
System.out.println("Sum of each row or column "+n*(n*n+1)/2+":"); 
for(i=0; i<n; i++) 
{ 
    for(j=0; j<n; j++) 
        System.out.print(magicSquare[i][j]+" "); 
    System.out.println(); 
} 
}

/************************************************************************************************************************
* @param stake: Enter the value for stake.
* @param goal:  Enter the value for goal.
* @param number Enter the value for number.
*************************************************************************************************************************/
public static void gambler(int stake, int goal, int number)
{
double bets = 0;
double win = 0;
for(int i=0;i<number;i++)
{
int cash =stake;
while(cash>0 && cash<goal) {
bets++;
	if(Math.random()<0.5)
		cash++;
		else
			cash--;
}
if(cash==goal)
	win++;
}
System.out.println("win is:"+win);
System.out.println("percentage of win is:"+100*win/number);
System.out.println("percentage of lost is:"+100*(number-win)/number);
System.out.println("total bets are:"+bets);
}




/********************************************************************************************************************************************************************************************************************
* @param arr: It take value array.
* @param n:   Enter the number of value.
* @return:    Return the result.
****************************************************************************************************************************************************************************/
public static int removeDuplicateElements(int arr[], int n){ 
int[] temp = new int[n];  
int j = 0;  
for (int i=0; i<n-1; i++){  
    if (arr[i] != arr[i+1]){  
        temp[j++] = arr[i];  
    }  
 }  
temp[j++] = arr[n-1];     

for (int i=0; i<j; i++){  
    arr[i] = temp[i];  
}  
return j;  
}  

/**************************************************************************************************************************
 * @param n: It takes input from user.
 **************************************************************************************************************************/
public static void arm(int n)
{
int s1=n;
int length=0;

while(s1!=0)
{
	length=length+1;
	s1=s1/10;
}
System.out.println(length);
int s2=n;
int rem,arm=0;
while(s2!=0)
{	int mul=1;
	rem=s2%10;
for(int i=1;i<=length;i++)
{
	mul=mul*rem;

}
arm=arm+mul;
s2=s2/10;
}

if(n==arm)
{
	
	System.out.println("Armstrong number");
}
else
{
	System.out.println("Not a Armstrong number");
	}

}


/***************************************************************************************************************************************************************************************************************************
 * @param x It takes input.
 * @return
 ***************************************************************************************************************************************/
public static int swapNibbles(int x) 
	{ 
	    return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
	} 

/*********************************************************************************************************
 * @param n
 ********************************************************************************************************/
public static void binary(int n)
{String x="";
	while(n>0)
	{	
		int count = 0;
		int a=n%2;
		if(a==1)
		{
		
			count++;
		}
	x=x+" "+a;
	n=n/2;
	}

}
	  
}
	

