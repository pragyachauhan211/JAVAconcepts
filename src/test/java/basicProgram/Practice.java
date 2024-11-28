package basicProgram;

import java.util.Arrays;

public class Practice {
	
	public void shiftRotate()
	{
		int[] arr = {12, 0, 7, 0, 8, 0, 3};
		
		for(int i=0; i<arr.length/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		Practice p = new Practice();
		p.shiftRotate();
	}

}
