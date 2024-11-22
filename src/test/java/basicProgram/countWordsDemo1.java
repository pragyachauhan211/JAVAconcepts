package basicProgram;
import java.util.Arrays;

public class countWordsDemo1 {
	
	 public static int
     countWords(String str)
   {
        
       // Check if the string is null
       // or empty then return zero
       if (str == null || str.isEmpty())
           return 0;
        
       // Splitting the string around
       // matches of the given regular
       // expression
       
       String[] words = str.split("\\s+");
       System.out.println(words.toString()); // it will not print string array
       System.out.println(Arrays.toString(words)); // it will print string array elements correctly
        
       // Return number of words
       // in the given string
       return words.length;
   }

	public static void main(String[] args) {
		
		// Given String str
        String str =
          "One two       three\n four\tfive ";
         
        // Print the result
        System.out.println("No of words : " +
           countWords(str));
	
	}

}
