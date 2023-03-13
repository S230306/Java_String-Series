
/*Write a Java program to find the common characters between two given strings. */
import java.util.*;

public class String14 {
    public static void findtheCommonChar(String s1, String s2) {
        // String comman = "";
        // for (int idx = 0; idx < s1.length(); idx++) {
        // for (int jdx = 0; jdx < s2.length(); jdx++) {
        // char ch1 = s1.charAt(idx);
        // char ch2 = s2.charAt(jdx);
        // if (ch1 == ch2) {
        // comman += ch2;
        // }
        // }
        // }
        // System.out.print(comman);
        Set<Character> set1 = new HashSet<>();
        for (int idx = 0; idx < s1.length(); idx++) {
            set1.add(s1.charAt(idx));
        }
        Set<Character> set2 = new HashSet<>();
        for (int idx = 0; idx < s1.length(); idx++) {
            set2.add(s2.charAt(idx));
        }
        // copy all the character
        set1.retainAll(set2);
        for (char commanChar : set1) {
            System.out.print(commanChar);
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        String str2 = scn.next();
        findtheCommonChar(str1, str2);
    }
}
