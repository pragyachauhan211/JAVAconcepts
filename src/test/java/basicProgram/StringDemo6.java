package basicProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// remove duplicate character from a string
public class StringDemo6 {
	
	//String check1 = "aasfggfffaadadfsa";
	String check1 = "aasfggfffaadadfsa";
	LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();
	public void count()
	{
		for(int i=0; i<check1.length();i++)
		{

			if(hmap.containsKey(check1.charAt(i)))
			{
				check1.replace(String.valueOf(check1.charAt(i)),"");
			}
			else
			{
				hmap.put(check1.charAt(i), 1);
			}
		}

		for(Map.Entry<Character, Integer> entry: hmap.entrySet())
		{
			System.out.println(entry.getKey());
		}

	}

	public static void main(String[] args) {
		StringDemo6 p = new StringDemo6();
		p.count();
	}

}
