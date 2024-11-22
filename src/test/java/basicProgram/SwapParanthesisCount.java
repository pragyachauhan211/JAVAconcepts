package basicProgram;

public class SwapParanthesisCount {
	static long swapCount(String s) 
    {
        char[] chars = s.toCharArray();
        
        // stores total number of Left and Right 
        // brackets encountered
        int countLeft = 0, countRight = 0; 
        // swap stores the number of swaps required
        //imbalance maintains the number of imbalance pair
        int swap = 0 , imbalance = 0; 
        
        for(int i =0; i< chars.length; i++) 
        {
            if(chars[i] == '[') 
            {
                // increment count of Left bracket
                countLeft++; 
                if(imbalance > 0) 
                {
                    // swaps count is last swap count + total 
                    // number imbalanced brackets
                    swap += imbalance; 
                    // imbalance decremented by 1 as it solved
                    // only one imbalance of Left and Right
                    imbalance--;     
                }
            } else if(chars[i] == ']' ) 
            {
                // increment count of Right bracket
                countRight++; 
                // imbalance is reset to current difference 
                // between Left and Right brackets
                imbalance = (countRight-countLeft); 
            }
        }
        return swap;
    }

    public static void main(String args[]) 
    {
    	// it will swap 3,4th index - count 1
    	// then it will swap 5,6th index - count 2
    	// so it will become - [][][]
        String s = "[]][][";
        System.out.println(swapCount(s) );
        // It will not swap anything, as it is already paired
        // hence swap count will be 0
        s = "[[][]]";
        System.out.println(swapCount(s));
        
        s = "[[]]][[]]][]";
        System.out.println(swapCount(s) );
        
        s = "]]]]]]";
        System.out.println(swapCount(s) );
        
    }
}
