package basicProgram;

import java.util.Arrays;

// left shift
public class Practice {
	
	public void shiftRotate()
	{
		int arr[] = {0,3,2,1,5,0,3,0};
		int counter=0;
		for(int i=0; i<arr.length; i++)
		{	
			if(arr[i]!=0)
			{
				arr[counter]=arr[i];
				counter++;
			}
		}
		
		while(counter<arr.length)
		{
			arr[counter]=0;
			counter++;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) 
	{
		Practice p = new Practice();
		p.shiftRotate();
	}

}
