package basicProgram;
import java.util.Scanner;
public class fibonacciDemo2 {
		int a= 0;
		int b= 1;
		int counter=10;
		
	Scanner s = new Scanner(System.in);
	
	public void fibo()
	{
		System.out.println("Enter a value");
		counter = s.nextInt();
		for(int i=1; i<=counter;i++)
		{
			b = a+b;
			a= b-a;
			
			System.out.println(i+" is "+a);
		}
		
	}

	public static void main(String[] args) {
		fibonacciDemo2 f = new fibonacciDemo2();
		f.fibo();

	}

}
