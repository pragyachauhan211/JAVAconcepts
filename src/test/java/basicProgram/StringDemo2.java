package basicProgram;

// left shift
public class StringDemo2 {
	
	public void shiftRotate()
	{
		String originalString = "helloiampragya";
        
        originalString = originalString.replaceAll("[aeiou]", "");
        System.out.println(originalString);

	}
	
	public static void main(String[] args) 
	{
		StringDemo2 p = new StringDemo2();
		p.shiftRotate();
	}
}
