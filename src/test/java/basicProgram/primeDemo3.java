package basicProgram;

import java.util.ArrayList;
import java.util.List;

import basicJava.staticDemo1;

public class primeDemo3 {
	
	List<Integer> list = new ArrayList<>();
	int[] arr = {4,2,3,5,10};
	
	public void primeList()
	{
		for(int i=0; i<arr.length;i++)
		{
			if(prime(arr[i]))
			{
				list.add(arr[i]);
			}
		}
		System.out.println(list);
	}
	
	public static boolean prime(int num)
	{
		if(num<=1)
			return false;
		else if(num==2)
			return true;
		else if(num%2==0)
			return false;
		for(int i=3; i<=Math.sqrt(num);i+=2)
		{
			if(num%i==0)
			return false;
		}
		return true;		
	}

	public static void main(String[] args) {
		primeDemo3 dem = new primeDemo3();
		dem.primeList();

	}

}
