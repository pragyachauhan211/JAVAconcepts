package basicProgram;

import org.springframework.util.StringUtils;

// left 
public class StringDemo4 {
	
	String name = "sfwpekdhisdfkqw hiadndhilfwhiadflksfhiwassakdhi";	
	String findStr = "hi";
	
	public void count() 
	{
		name = name.replaceAll("\\s+", "");
		name = name.replaceAll("whi", "");
		System.out.println(StringUtils.countOccurrencesOf(name, findStr));				
	}
	
	public static void main(String[] args) {
		StringDemo4 p = new StringDemo4();
		p.count();
	}

}
