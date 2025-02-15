package basicProgram;

// print all sub arrays with 0 sum

public class sumofIntegerIndemo4 {

    public void sum()

    {
        int[] arr = {6,3,-1,-3,4,-2,2,4,6,-12,-7};
        int n = arr.length;

        // Consider all subarrays starting from 'i'
        for (int i = 0; i < n; i++) {
            int sum = 0;

            // Consider all subarrays ending at 'j'
            for (int j = i; j < n; j++) {
                sum += arr[j];

                // If the sum is zero, print the subarray
                if (sum == 0) {
                    System.out.println("Subarray found from Index " + i + " to " + j);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        sumofIntegerIndemo4 p = new sumofIntegerIndemo4();
        p.sum();
    }
}
