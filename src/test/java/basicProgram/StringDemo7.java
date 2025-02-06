package basicProgram;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

// In string, convert first character of every word in uppercase
public class StringDemo7 {
	
	//String check1 = "aasfggfffaadadfsa";
	String check1 = "my name is pragya kumari";
	char[] c = check1.toCharArray();

	public void count()
	{
		for(int i=0; i<c.length; i++)
		{
			c[0] = Character.toUpperCase(c[0]);
			if(c[i]==' ')
			{
				c[i+1] = Character.toUpperCase(c[i+1]);
			}
		}
		System.out.println(String.valueOf(c));
	}

	public static void main(String[] args) {
		StringDemo7 p = new StringDemo7();
		p.count();
	}

}
