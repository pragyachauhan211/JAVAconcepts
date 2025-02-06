package basicProgram;

import org.springframework.util.StringUtils;

import java.util.regex.Pattern;

// check if string contains only digits

public class StringDemo5 {
	
	String check1 = "sfwpekdhisdfkqw hiadndhilfwhiadflksfhiwassakdhi";
	String check2 = "sfdsd424";
	String check3 = "34524";

	public void count()
	{
		if(Pattern.matches("[0-9]+",check3))
		{
			System.out.println("String contains only digits");
		}
		else
		{
			System.out.println("String contains not only digitss");
		}
	}

	
	public static void main(String[] args) {
		StringDemo5 p = new StringDemo5();
		p.count();
	}

}
