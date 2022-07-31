/*21ce148upadhyay prince
Given an array of strings, return a new array without the strings that are equal to the target string.
 One approach is to count the occurrences of the target string, make a new array of the correct length,
  and then copy over the correct strings.
 wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
 wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]
 */
import java.util.*;
public class Arr {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the size of array");
        int r=scn.nextInt();
        System.out.println("enter the char array");
        char[] a=scn.next().toCharArray();
        System.out.println("enter the char which you dont want in updated string");
        char p=scn.next().charAt(0);
        for(int i=0;i<r;i++){

        if(a[i]!=p){
            System.out.println(a[i]);
            }
}
    }
}
