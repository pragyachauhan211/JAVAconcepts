package basicProgram;

import java.util.Arrays;

// reverse a string by preserving it's space
public class reverseDemo5 {
	
	public void reverse()
	{
		String s = "my name is pragya kumari";
		System.out.println(s);
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();

		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==' ')
			{
				sb.insert(i,' ');
			}
		}
		for(int i=0; i<s.length(); i++)
		{
			if(sb.charAt(i)!=' ')
			{
				if(s.charAt(i)==' ')
				{
					sb.deleteCharAt(i);
				}
			}

		}

		System.out.println(sb);
	}


	public static void main(String[] args) {
		reverseDemo5 r = new reverseDemo5();
		r.reverse();

	}

}
