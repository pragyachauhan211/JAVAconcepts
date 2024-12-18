package basicProgram;

import java.util.Arrays;

// left 
public class sumOfIntegerInStringDemo2 {
	int[] a = {-5,0,2,1,-6,7,9,0,4};
	int n=4;
	
	public void count() 
	{
		String input = "z3asdef 35sfs 34 wdsf 33";
		String newInput[] = input.split(" ");		
		
		int num =0;
		
		for(String s : newInput)
		{
			if(s.matches("[a-z0-9]+"))
			{
				if(s.matches("[a-z]+"))
				{
					continue;
				}
				s = s.replaceAll("[a-zA-Z]", "");	
				num = num + Integer.parseInt(String.valueOf(s));
			}
		}
		
		System.out.println("sum = "+num);
		
	}
	

	public static void main(String[] args) {
		sumOfIntegerInStringDemo2 p = new sumOfIntegerInStringDemo2();
		p.count();
	}

}
