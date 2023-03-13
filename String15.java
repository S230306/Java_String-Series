
/*Write a Java program to capitalize the first letter of each word in a given string. */
import java.util.*;

public class String15 {
    public static void convertFirstLetterCpital(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 1).toUpperCase());
        for (int idx = 1; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            sb.append(ch);
        }
        System.out.print(sb);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        convertFirstLetterCpital(str);
    }
}
