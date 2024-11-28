package basicProgram;

import java.util.Arrays;
import java.util.Collections;

// reverse element of an array at some position
public class reverseArrayDemo7 {
	
	 // Reverse subarray a[0..k-1]
    public void reverse()
    {
    	 Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
    	    int k = 4;
    	 
    	    // Java Library function to reverse element
    	    // from 0 index to K-1 index.
    	    Integer[] arr1 = Arrays.copyOfRange(arr, 0, k);   
    	    Collections.reverse(Arrays.asList(arr1));
    	    System.arraycopy(arr1, 0, arr, 0, k);  
    	 
    	    // printing the array after reversing
    	    // first K elements.
    	    for (int i = 0; i < 8; i++) {
    	    System.out.print(arr[i] + " ");
    	    }
    	    }
    
 
    // Driver code
    public static void main(String args[])
    {
    	reverseArrayDemo7 rev = new reverseArrayDemo7();
    	rev.reverse();
    }
}
