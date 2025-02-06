package basicProgram;

public class pangram {
	
	public static void abc(String s)
	{
		boolean flag=true;

		for(char c='a'; c<='z';c++)
		{
			if(!s.contains(String.valueOf(c)))
			{
				flag=false;
				break;
			}
		}

		if(flag)
			System.out.println("It is panagram");
		else
			System.out.println("It is not a panagram");
	}

	public static void main(String[] args) {
		//String s = "abc";
		String s = "abcdefghi adfjklmnopqrstuvwxyzsf";
		abc(s);

	}
}
