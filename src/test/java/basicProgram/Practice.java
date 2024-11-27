package basicProgram;

import basicJava.staticDemo1;

public class Practice {
	
	public void shiftRotate()
	{
		
		int num = 123;
		int result=0;
		int remainder =0;
		
		while(num>0)
		{
			remainder = num%10;
			result = result*10 + remainder;
			num = num/10;
		}
		
		System.out.println(result);
	}
	

	public static void main(String[] args) {
		Practice p = new Practice();
		p.shiftRotate();

	}

}
