package basicProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import basicJava.staticDemo1;

class CountMaxRepeatedCharDemo6 {
	
	public void hashCount(String name1)
	{
		
		String name = name1.replace(" ", "");
		HashMap<Character, Integer> hashObj= new HashMap<Character, Integer>();
		char[] c1 = name.toCharArray();
		
		for(char c2 : c1)
		{
			if(hashObj.containsKey(c2))
			{
				hashObj.put(c2, hashObj.get(c2)+1);
			}
			else 
			{
				hashObj.put(c2, 1);
			}
		}
		
		int maxValue = 0;
		char maxKey = ' ';
		int currentValue = 0;
		char currentKey = ' ';
		for(Map.Entry entry: hashObj.entrySet())
		{		
			currentValue = (int) entry.getValue();
			currentKey = (char) entry.getKey();
			if(currentValue>maxValue)
			{
				maxValue=currentValue;
				maxKey = currentKey;
			}			
		}
		System.out.println(maxKey+" - "+maxValue);
		
			
	}
	
	public static void main(String args[]) 
	{	
		CountMaxRepeatedCharDemo6 obj = new CountMaxRepeatedCharDemo6();
		obj.hashCount("Teeeeeeeeeesst opppss");
		
	}

}
