 /*21ce148 upadhyay prince
 Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
  So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az"
   substrings appear in the same place in both strings.
 stringMatch("xxcaazz", "xxbaaz") →3
 stringMatch("abc", "abc") → 2
 stringMatch("abc", "axc") → 0
  */

import java.util.*;
public class Check {
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        String str1= scn.next();
        System.out.println("Entered String  : " + str1);
        String str2= scn.next();
        System.out.println("Entered String  : " + str2);
        int l1= str1.length();
        int l2=str2.length();
        int l;
        int temp=0;
        if(l1<l2){
            l=l1;
        }
        else {
            l=l2;
        }
        for(int i=0;i<l-1;i++)
        {
            if (str1.charAt(i) == str2.charAt(i)) {
                 if (str1.charAt(i+1) == str2.charAt(i+1))
                 {
                    temp++;
                 }
            }
        }
        System.out.println(temp);
    }
}
