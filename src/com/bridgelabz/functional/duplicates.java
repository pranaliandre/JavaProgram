/******************************************************************************
 *  Purpose: To remove the duplicates from array.
 *
 *  @author  Andre Pranali
 *  @version 1.24
 *  @since   10-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class duplicates{  

    public static void main (String[] args) {  
        int arr[] = {1,2,3,3,4,5,5,5};  
        int length = arr.length;  
        length =Utility.removeDuplicateElements(arr, length);  
        for (int i=0; i<length; i++)  
           System.out.print(arr[i]+" ");  
    }  
}  