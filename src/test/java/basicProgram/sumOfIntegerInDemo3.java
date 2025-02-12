package basicProgram;

public class sumOfIntegerInDemo3 {
   // the sum of 2 array should be 17
    public void leap() {
        int[] arr = {6, 8, 11, 6, 7, 10, 18};

        for(int i = 0; i < arr.length - 1; i++)
        {
        for (int j = i; j < arr.length - 1; j++) {
            if (arr[i]!=arr[j+1])
            {

            if (arr[i] + arr[j + 1] == 17) {
                System.out.println(arr[i]);
                System.out.println(arr[j + 1]);

            }
        }

        }
    }
    }

    public static void main(String[] args) {
        sumOfIntegerInDemo3 p = new sumOfIntegerInDemo3();
        p.leap();
    }
}
