package basicProgram;

import java.util.Arrays;

// reverse element of an array
public class reverseArrayDemo3 {
	
	public void reverseString()
	{
		 int[] arr = {1, 2, 3, 4, 5};

	        // Swap elements from start to end
	        for (int i = 0; i < arr.length / 2; i++) {
	            int t = arr[i];
	            arr[i] = arr[arr.length - 1 - i];
	            arr[arr.length - 1 - i] = t;
	        }

	        System.out.println("" + Arrays.toString(arr));
	    }
	

	public static void main(String[] args) {
		reverseArrayDemo3 r = new reverseArrayDemo3();
		r.reverseString();

	}

}
