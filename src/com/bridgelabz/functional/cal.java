package com.bridgelabz.functional;
public class cal
{
public static int day(int month, int day, int year)
{
    int y = year - (14 - month) / 12;
    int x = y + y/4 - y/100 + y/400;
    int m = month + 12 * ((14 - month) / 12) - 2;
    int d = (day + x + (31*m)/12) % 7;
    return d;
}

// return true if the given year is a leap year
public static boolean isLeapYear(int year) 
{
    if  ((year % 4 == 0) && (year % 100 != 0)) return true;
    if  (year % 400 == 0) return true;
    return false;
}

public static void main(String[] args)
{
    int month = Integer.parseInt(args[0]);    
    int year = Integer.parseInt(args[1]);    

    int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    if (month == 2 && isLeapYear(year)) days[month] = 29;
    if(month==1)
    {
    System.out.println("Jan"+" "+year);
    }
    if(month==2)
    {
    System.out.println("Feb"+" "+year);
    }
    if(month==3)
    {
    System.out.println("Mar"+" "+year);
    }
    if(month==4)
    {
    System.out.println("Apr"+" "+year);
    }
    if(month==5)
    {
    System.out.println("May"+" "+year);
    }
    if(month==6)
    {
    System.out.println("Jun"+" "+year);
    }
    if(month==7)
    {
    System.out.println("Jul"+" "+year);
    }
    if(month==8)
    {
    System.out.println("Aug"+" "+year);
    }
    if(month==9)
    {
    System.out.println("Sept"+" "+year);
    }
    if(month==10)
    {
    System.out.println("Oct"+" "+year);
    }
    if(month==11)
    {
    System.out.println("Nov"+" "+year);
    }
    if(month==12)
    {
    System.out.println("Dec"+" "+year);
    }
    
    System.out.println(" ");
    System.out.println(" S  M Tu  W Th  F S");

    int d = day(month, 1, year);

    for (int i = 0; i < d; i++)
        System.out.print("   ");
    for (int i = 1; i <= days[month]; i++) {
        System.out.printf("%2d ", i);
        if (((i + d) % 7 == 0) || (i == days[month])) 
        	System.out.println();
    }
}
}
