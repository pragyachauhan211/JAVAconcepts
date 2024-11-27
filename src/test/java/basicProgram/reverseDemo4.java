package basicProgram;

public class reverseDemo4 {
	int result=0,remainder = 0;
	
	public int demo2(int num)
	{
		while(num>0)
		{
			remainder = num%10;
			result = result*10 + remainder;
			num=num/10;
		}
		return result;
	}

	public static void main(String[] args) {
		reverseDemo4 rd = new reverseDemo4();
		System.out.println(rd.demo2(123));

	}

}
