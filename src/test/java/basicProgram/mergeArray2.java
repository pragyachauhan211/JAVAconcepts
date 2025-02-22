package basicProgram;

import java.util.Arrays;

public class mergeArray2 {

    public void merge()
    {
        int[] a = {1,4,2,35,3};
        int[] b = {4,2,1};
        int a1 = a.length;
        int b2 = b.length;
        int c2 = a1 + b2;
        int[] c = new int[c2];

        for (int i=0; i<a1; i++)
        {
            c[i] = a[i];
        }

        for (int i=0; i<b2; i++)
        {
            c[a1+i] = b[i];
        }

        System.out.println(Arrays.toString(c));
    }


   public static void main(String[] args)
   {
       mergeArray2 m = new mergeArray2();
       m.merge();
   }
}
