
/*Write a Java program to remove all the white spaces from a string. */
import java.util.*;

public class String10 {
    public static void removeWhiteSpace(String str) {
        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            if (ch == ' ') {
                continue;
            }
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = "i love my india";
        removeWhiteSpace(str);
    }
}
