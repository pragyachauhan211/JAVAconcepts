package basicProgram;

public class SeaprateNegativeToLeft {

	 static void rearrange(int[] arr) {
	 
		 int n = arr.length;
		 
	        // Create an empty array to store result
	        int[] temp = new int[n];
	        int idx = 0;

	        // First fill non-negative elements into the 
	        // temporary array
	        for (int i = 0; i < n; i++) {
	            if (arr[i] <= 0) 
	                temp[idx++] = arr[i];
	        }

	        // Now fill negative elements into the 
	        // temporary array
	        for (int i = 0; i < n; i++) {
	            if (arr[i] > 0) 
	                temp[idx++] = arr[i];
	        }

	        // copy the elements from temp to arr
	        System.arraycopy(temp, 0, arr, 0, n);
	 }
 
    public static void main(String[] args)
    {
    	 int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
         
         rearrange(arr);
       
           for (int ele: arr)
             System.out.print(ele + " ");
    }
}
