package basicProgram;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// left 
public class StringDemo3 {
	
	public void count() 
	{
		String input = "Cheese Milk! 12345? cutter 3456";
		//outpus - count the substring only when there is no special character 
		// so in this case count of substring without special character is 3(Cheese, cutter, 3456)
		String[] newInput = input.split("\\s+");
	    int count =0;
	     
		for(String s : newInput)
		{
			     
			if(Pattern.matches("[a-zA-Z0-9]+",s))
			{
				count++;
			}
			else
			{		
				s= s.replaceAll(s, "");
				System.out.println();
			}
			
		}
		System.out.println(count);
	}
	

	public static void main(String[] args) {
		StringDemo3 p = new StringDemo3();
		p.count();
	}

}
