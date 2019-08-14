/******************************************************************************
 *  Purpose: To calculate area of triange and slope.
 *
 *  @author  Andre Pranali
 *  @version 1.31
 *  @since   14-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;

public class slopeArea {
	
public static void main(String[] args) {
			System.out.println("Enter the value of x1,y1");
			int x1=Utility.integervalue();
			int y1=Utility.integervalue();

			
			System.out.println("Enter the value of x2,y2");
			int x2=Utility.integervalue();
			int y2=Utility.integervalue();
			
			System.out.println("Enter the value of x3,y3");
			int x3=Utility.integervalue();
			int y3=Utility.integervalue();
			
			int slopab=(y2-y1)/(x2-x1);
			int slopbc=(y3-y2)/(x3-x2);
			int slopeac=(y2-y1)/(x3-x2);
			
			if(slopab==slopbc && slopbc==slopeac )
			{
				System.out.println("Colinear");
			}
			else
			{
				System.out.println("not colinear");
			}
int area=1/2*((x1-x2)*(y2-y3)-(x2-x3)*(y1-y2));
System.out.println(area);

}
		

	
}