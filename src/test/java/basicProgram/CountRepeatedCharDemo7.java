package basicProgram;

import net.bytebuddy.build.BuildLogger;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

class CountRepeatedCharDemo7 {
	LinkedHashMap<Character, Integer> hashObj= new LinkedHashMap<Character, Integer>();
	
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

		for(Map.Entry entry: hashObj.entrySet())
		{
			int a= (int) entry.getValue();
			if(a==1)
			{
			System.out.println(entry.getKey()+" -"+entry.getValue());
			break;
			}
		}
		
		
			
	}
	
	public static void main(String args[]) 
	{	
		CountRepeatedCharDemo7 obj = new CountRepeatedCharDemo7();
		//obj.hashCount("Teeeeeeeeeesst opppss");
		obj.hashCount("my name is pragya kumari");
	}

}
