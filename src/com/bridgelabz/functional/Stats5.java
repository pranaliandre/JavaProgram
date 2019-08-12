
/******************************************************************************
 *  Purpose: to the purpose of calculating average, minimum and ,maxmum.
 *  @author  Andre Pranali
 *  @version 1.9
 *  @since   2-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.functional;
import com.bridgelabz.utility.Utility;
public class Stats5 {
	
	public static void main(String[] args)
	{ 
		
	   double firstvalue = Math.random();
	  System.out.println(firstvalue);
	  
	  double secondvalue = Math.random(); 
	  System.out.println(secondvalue);
	  
	  double thirdvalue = Math.random(); 
	  System.out.println(thirdvalue);
	  
	  double forthvalue =Math.random(); 
	  System.out.println(forthvalue);
	  
	  double fifthvalue =Math.random(); 
	  System.out.println(fifthvalue);
	  
	  double min = Math.min(firstvalue, Math.min(secondvalue, Math.min(thirdvalue, Math.min(forthvalue, fifthvalue))));
		
		double max = Math.max(firstvalue, Math.max(secondvalue, Math.max(thirdvalue, Math.max(forthvalue,fifthvalue))));


	  double average=0;
	   average = Utility.average(firstvalue,secondvalue,thirdvalue,forthvalue,fifthvalue);
	  
	  System.out.println("min in:"+min);
	  System.out.println("max is:"+max);
	  System.out.println("average is:"+average);
	  
	}

}
