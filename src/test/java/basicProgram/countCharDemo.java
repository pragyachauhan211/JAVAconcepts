package basicProgram;

public class countCharDemo {
	 String string = "The best ";   
	 int count = 0;   
	 
	public void count()
	{
 	  for(int i = 0;i<string.length();i++)	
	  {
		  if(string.charAt(i)!=' ')		  
			  count++; 		  
	  }
	  System.out.println(count);
	}

	public static void main(String[] args) {
		 
		countCharDemo cd = new countCharDemo();
		cd.count();
	            
	      
	      
	}

}
