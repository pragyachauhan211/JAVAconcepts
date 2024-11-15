package basicProgram;

import com.google.common.util.concurrent.ClosingFuture.ValueAndCloser;

public class StringToIntWithoutParseMethod {
	
	public void practice()
	{
		String value = "1653";
		int num = 0;
		for(int i=0; i<value.length();i++)
		{	
			
			num = num*10 + value.charAt(i)-48;
		}
		System.out.println(num);
	}

	public static void main(String[] args) {

		StringToIntWithoutParseMethod obj = new StringToIntWithoutParseMethod();
		obj.practice();
	}

}
