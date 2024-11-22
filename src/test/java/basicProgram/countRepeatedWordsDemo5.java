package basicProgram;

import java.util.*;

class countRepeatedWordsDemo5 {
    static void characterCount(String inputString)
    {
        // Creating a HashMap containing char
        // as a key and occurrences as  a value
        HashMap<String, Integer> charCountMap
            = new HashMap<String, Integer>();
 
        // Converting given string to string array
        String[] strArray = inputString.split("\\s+");
 
        // checking each char of strArray
        for (String s : strArray) {
            if (charCountMap.containsKey(s)) {
                // If char is present in charCountMap,
                // incrementing it's count by 1
                charCountMap.put(s, charCountMap.get(s) + 1);
            }
            else {
 
                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                charCountMap.put(s, 1);
            }
        }
 
        // Printing the charCountMap
        for (Map.Entry entry : charCountMap.entrySet()) 
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        String str = "My name is Pragya is";
        characterCount(str);
    }
}