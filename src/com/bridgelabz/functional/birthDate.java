package com.bridgelabz.functional;
import java.util.Random;
public class birthDate {

		public static void main(String[] args) {
			
			int day;
			int month;
			int count=0;
			
			Random random=new Random();
			
			for(int i=0;i<50;i++)
			{
				day=1+random.nextInt(30);
				month=1+random.nextInt(12);
				int year=1992+random.nextInt(2);
				
				String birthday=String.valueOf(day)+"-"+String.valueOf(month)+"-"+String.valueOf(year);
				System.out.println(birthday);
				String[] s=birthday.split("-");
				char a=s[1].charAt(0);
				
				if(a=='6')
				{
					count++;
					
				}
			}
			System.out.println(count);
				
				
			}

	}

			
