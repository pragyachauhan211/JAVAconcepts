package triang;

import java.util.Scanner;

public class triangleDemo17 {
	
	public void triangle()
	{int i, j, n;  
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter the number of rows you want to print: ");  
	n = sc.nextInt();  
	for (i = 1; i <= n; i++)   
	{   
	for (j = i; j >= 1; j--)  
	{  
	System.out.print(j+" ");  
	}  
	System.out.println();  
	}           
	}   

	public static void main(String[] args) {
		triangleDemo17 sp = new triangleDemo17();
		sp.triangle();

	}

}