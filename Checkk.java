// 21ce148 Prince upadhyay
// Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias"
// yields "oz".
// startOz("ozymandias") → "oz"
// startOz("bzoo") → "z"
// startOz("oxx") → "o"
import java.util.*;
public class Checkk {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        System.out.println("Entered String  : " + str1);
        char f = str1.charAt(0);
        char k = str1.charAt(1);
        if (f == 'o') {
            System.out.print(f);
        }
        if (k == 'z') {
            System.out.print(k);
        }
    }
}

