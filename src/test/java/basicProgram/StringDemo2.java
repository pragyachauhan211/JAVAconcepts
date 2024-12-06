package basicProgram;

// left shift
public class StringDemo2 {
	
	public void shiftRotate()
	{
		String originalString = "helloiampragya";
        String newString = "";
        
        newString = originalString.replaceAll("[aeiou]", "");
        System.out.println(newString);

	}
	
	public static void main(String[] args) 
	{
		StringDemo2 p = new StringDemo2();
		p.shiftRotate();
	}
}
