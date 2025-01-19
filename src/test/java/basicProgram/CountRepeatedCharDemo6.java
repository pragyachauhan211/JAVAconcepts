package basicProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import basicJava.staticDemo1;

class CountRepeatedCharDemo6 {
	HashMap<Character, Integer> hashObj= new HashMap<Character, Integer>();
	
	public void hashCount(String name1)
	{	
		String name = name1.replace(" ", "");
		
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
		
		
			
	}
	
	public void maxCount()
	{
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
	
	public void minCount()
	{
		int minValue = Integer.MAX_VALUE;
		char minKey = ' ';
		int currentValue = 0;
		char currentKey = ' ';
		for(Map.Entry entry: hashObj.entrySet())
		{		
			currentValue = (int) entry.getValue();
			currentKey = (char) entry.getKey();
			if(currentValue<minValue)
			{
				minValue=currentValue;
				minKey = currentKey;
			}			
		}
		System.out.println(minKey+" - "+minValue);
		
	}
	
	public static void main(String args[]) 
	{	
		CountRepeatedCharDemo6 obj = new CountRepeatedCharDemo6();
		//obj.hashCount("Teeeeeeeeeesst opppss");
		obj.hashCount("my name is pragya kumari");
		obj.maxCount(); // count maximum occurrence of character
		obj.minCount(); // count minimum occurrence of character
	}

}
