package basicProgram;

public class If2ArrayElementsDuplicateOrNot {

	public void abc() {
		int[] array1 = { 6,1, 2, 3, 4, 5 };
		int[] array2 = { 1, 2, 3, 4, 5 };
        int count=0;
		for (int i = 0; i < array1.length; i++)
		{
			for (int j = 0; j < array2.length ; j++) 
			{
				if (array1[i] == array2[j]) 
				{
				  count++;
				  break;
				}				
			}
			if(count==0)
			{
				System.out.println(array1[i]+" is Non duplicate");
			}
		}
	}

	public static void main(String[] args) {
		If2ArrayElementsDuplicateOrNot a = new If2ArrayElementsDuplicateOrNot();
		a.abc();
	}
}
