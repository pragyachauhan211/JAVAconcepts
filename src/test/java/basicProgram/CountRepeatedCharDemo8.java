package basicProgram;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

class CountRepeatedCharDemo8 {
	LinkedHashMap<String, Integer> hashObj= new LinkedHashMap<String, Integer>();
	String display = "my,pragya";
	String display1[] = display.split(",");
	public void hashCount(String name1)
	{	

		String[] c1 = name1.split("\\s+");
		for(String c2 : c1)
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

		for(Entry entry: hashObj.entrySet())
		{

			for(int i=0; i<display1.length;i++)
			{
				if(entry.getKey().equals(display1[i]))
				{
					System.out.println(entry.getKey() + " -" + entry.getValue());
				}
			}

		}
		
		
			
	}
	
	public static void main(String args[]) 
	{	
		CountRepeatedCharDemo8 obj = new CountRepeatedCharDemo8();
		//obj.hashCount("Teeeeeeeeeesst opppss");
		obj.hashCount("my name is pragya kumari my pragya");
	}

}
