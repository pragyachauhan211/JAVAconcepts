package basicProgram;

import java.util.regex.Pattern;

// left 
public class sumOfIntegerInStringDemo2 {
	
	
	public void count() 
	{
		String input = "z3asdef 35sfs 34 wdsf 33";
		String newInput[] = input.split(" ");		
		
		int num =0;
		
		for(String s : newInput)
		{
			if(Pattern.matches("[a-z0-9]+", s))
			//if(s.matches("[a-z0-9]+"))
			{
				if(Pattern.matches("[a-z]+", s))
				//if(s.matches("[a-z]+"))
				{
					continue;
				}
				s = s.replaceAll("[a-zA-Z]", "");
				System.out.println(s);
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
