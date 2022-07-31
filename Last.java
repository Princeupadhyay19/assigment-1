
/*21ce148 prince upadhyay
Given two non-negative int values, return true if they have the same last digit,
 such as with 27 and 57.
 Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
 lastDigit(7, 17) → true
 lastDigit(6, 17) → false
 lastDigit(3, 113) → true*/
import java.util.*;
public class Last {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x= scn.nextInt();
        int y= x%10;
        int z= scn.nextInt();
        int p=z%10;
        if(y==p)
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


    }
}



