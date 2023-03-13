
/*Write a program to check if a given string is a palindrome or not. */
import java.util.*;

public class String2 {
    public static void reverseString(String str) {
        String res = "";
        for (int idx = str.length() - 1; idx >= 0; idx--) {
            char ch = str.charAt(idx);
            res += ch;
        }
        System.out.print(res.equals(str) ? "Given String is Pallindrome" : "Given Stirng is not Pallindrome");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        reverseString(str);

    }
}
