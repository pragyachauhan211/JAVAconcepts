package basicProgram;

public class reverseDemo5 {
	
	public void reverse()
	{
		String str = "hi welcome to Tutorialspoint";
		
	      str.split(" ");
	      StringBuffer sb= new StringBuffer(str);
	      sb.reverse();
	      for(int i=0 ; i<str.length(); i++){
	      if(str.charAt(i)== ' '){
	         sb.insert(i, " ");
	 	      }
	   }
	      
	      for(int i=0 ; i<str.length(); i++){
	    	  if(sb.charAt(i)== ' '){ // check if reverse string has any space
			        if(str.charAt(i)!=' ') // check if original string is not having any space
			        {
			        	sb.deleteCharAt(i); // remove space from reverse string
			        	
			        }
			 	      }
	      }
	
	   sb.append("");
	   System.out.println(sb);
	}

	public static void main(String[] args) {
		reverseDemo5 r = new reverseDemo5();
		r.reverse();

	}

}
