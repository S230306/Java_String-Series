
/*Write a Java program to find the maximum occurring character in a string. */
import java.util.*;

public class String9 {
    public static void MaximumOccurChar(String str) {
        int[] freq = new int[26];
        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            freq[ch - 'a']++;
        }
        char maxChar = 'N';
        int maxFreq = Integer.MIN_VALUE;
        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            if (freq[ch - 'a'] > maxFreq) {
                maxFreq = freq[ch - 'a'];
                maxChar = ch;
            }
        }
        System.out.println(maxChar);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        MaximumOccurChar(str);
    }
}