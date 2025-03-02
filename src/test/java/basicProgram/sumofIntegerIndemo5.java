package basicProgram;

public class sumofIntegerIndemo5 {

    // increment a number by 1 for whole array
    public static int[] count(int[] digits) {


        // If all digits were 9, create a new array with an extra digit for the carry
       // int[] result = new int[digits.length + 1];

        // Traverse the digits array from right to left
        for (int i = digits.length -1; i >=0; i--) {


                // If the digit is less than 9, just add 1 and return the array
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                // Otherwise, set the current digit to 0 and continue to the next digit
                digits[i] = 0;

        }

        // If all digits were 9, create a new array with an extra digit for the carry
        int[] result = new int[digits.length + 1];

        result[0] = 1; // The carry will make the number 100... (for example)


        return result;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }


        public static void main (String[] args)
        {
            int[] digit1 = {2, 9, 9};
            int[] digit2 = {1, 0, 0};
            int[] digit3 = {9, 9, 9};

            digit1 = count(digit1);
            digit2 = count(digit2);
            digit3 = count(digit3);

            printArray(digit1);
            printArray(digit2);
            printArray(digit3);
        }
    }

