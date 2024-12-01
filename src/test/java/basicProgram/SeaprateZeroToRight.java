package basicProgram;

import java.util.Arrays;

public class SeaprateZeroToRight {

	static void moveZerosToEnd(int inputArray[])
    {
        //Initializing counter to 0
        int counter = inputArray.length-1;
 
        //Traversing inputArray from left to right
        for (int i=inputArray.length-1; i>0; i--)
        {
            //If inputArray[i] is non-zero
            if(inputArray[i] != 0)
            {
                //Assigning inputArray[i] to inputArray[counter]
                inputArray[counter] = inputArray[i];
                
                //Incrementing the counter by 1
                counter--;
            }
        }
 
        //Assigning zero to remaining elements
        while (counter >= 0)
        {
            inputArray[counter] = 0;
 
            counter--;
        }
 
        System.out.println(Arrays.toString(inputArray));
    }
 
    public static void main(String[] args)
    {
        moveZerosToEnd(new int[] {12, 0, 7, 0, 8, 0, 3});
 
        moveZerosToEnd(new int[] {1, -5, 0, 0, 8, 0, 1});
 
        moveZerosToEnd(new int[] {0, 1, 0, 1, -5, 0, 4});
 
        moveZerosToEnd(new int[] {-4, 1, 0, 0, 2, 21, 4});
    }
}
