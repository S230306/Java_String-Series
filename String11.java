
/*Write a Java program to check whether two strings are anagrams or not. */
import java.util.*;

public class String11 {
    public static void Anagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.print(false);
        }
        int[] freq1 = new int[26];
        for (int idx = 0; idx < str1.length(); idx++) {
            char ch = str1.charAt(idx);
            freq1[ch - 'a']++;
        }
        int[] freq2 = new int[26];
        for (int idx = 0; idx < str2.length(); idx++) {
            char ch = str2.charAt(idx);
            freq2[ch - 'a']++;
        }
        for (int idx = 0; idx < str1.length(); idx++) {
            char ch = str1.charAt(idx);
            if (freq1[ch - 'a'] != freq2[ch - 'a']) {
                System.out.print(false);
                return;
            }
        }
        System.out.print(true);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        String str2 = scn.next();
        Anagram(str1, str2);
    }
}
