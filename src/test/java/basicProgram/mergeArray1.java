package basicProgram;

import java.util.Arrays;

public class mergeArray1 {

    public void merge()
    {
        int[] a = {1,4,2,35,3};
        int[] b = {4,2,1};
        int a1 = a.length;
        int b2 = b.length;
        int c2 = a1 + b2;
        int[] c = new int[c2];
        System.arraycopy(a,0, c, 0, a1);
        System.arraycopy(b,0,c,a1,b2);
        System.out.println(Arrays.toString(c));
    }


   public static void main(String[] args)
   {
       mergeArray1 m = new mergeArray1();
       m.merge();
   }
}
