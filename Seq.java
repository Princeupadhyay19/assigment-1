
 /* 21ce148 upaddhyay prince
 Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
array123([1, 1, 2, 3, 1]) → true
 array123([1, 1, 2, 4, 1]) → false
 array123([1, 1, 2, 1, 2, 3]) → true  */

import java.util.*;
public class Seq {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n= scn.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]= scn.nextInt();
            }
            for(int j=0;j<n;j++)
            {
                if(a[j]==3)
                {
                    for( int i=j-1;i>j-2;i--)
                    {
                        if (a[i] == 2 && a[i-1]==1) {
                            System.out.print(" true");
                        }
                        else{
                            System.out.print(" false");
                        }
                    }
            }
        }
    }
}
