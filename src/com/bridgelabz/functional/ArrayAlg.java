/******************************************************************************
 *  Purpose: To calculate the min max string from array.
 *  @author  Andre Pranali
 *  @version 1.31
 *  @since   16-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;


public class ArrayAlg {

   // private static final String String = null;


	public static String min(String[] arr) {
        if (arr == null || arr.length == 0)
            return null;

        String min = arr[0];
        String max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min.compareTo(arr[i]) > 0)
            {
                min = arr[i];
              
            }
            
        }
        return min;
        }
     
      public static String max(String[] arr) {
          if (arr == null || arr.length == 0)
              return null;

          String min = arr[0];
          String max = arr[0];

          for (int i = 1; i < arr.length; i++) {
        	  if (max.compareTo(arr[i]) < 0)
              {
                  max = arr[i];
                
              }
        	 
          } return max;
    }


public static void main(String[] args) {

        String[] words = {  "xa", "had", "a", "little", "lamb" };
       String obj = ArrayAlg.min(words);
       String obj1 = ArrayAlg.max(words);
       min(words);
        System.out.println("Minvalue: "+obj);
        max(words);
       System.out.println("Maxvalue: "+obj1);
     
}
}
