
/*Write a program to reverse a string in Java. */
import java.util.*;

public class String1 {
    public static String reverseString(String str) {
        String res = "";
        for (int idx = str.length() - 1; idx >= 0; idx--) {
            char ch = str.charAt(idx);
            res += ch;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.print(reverseString(str));
    }
}