package basicProgram;

public class Practice2 {
	
	public void sorting()
	{
		int[] array1 = { 6,1, 2,2, 3, 4, 5 };
		
        int count=0;
		for (int i = 0; i < array1.length; i++)
		{
			for (int j = i+1; j < array1.length-i ; j++) 
			{
				System.out.println(array1[i]);
				System.out.println(array1[j]);
				if (array1[i] == array1[j]) 
				{
				  count++;
				}
				array1[j]=0;
			}
			if(count>=1)
			{
				System.out.println(array1[i]+" is duplicate");
			}
			
		}
	
	  	
		
	}
	
	public static void main(String[] args) {
		
		Practice2 p = new Practice2();
		p.sorting();

	}

}
