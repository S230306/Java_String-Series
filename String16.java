
/*Question: Write a Java method that takes a string as input
 *and returns the first non-repeated character in the string. 
 *If there are no non-repeated characters, the method should return null. */
import java.util.*;

public class String16 {
    public static char printNonRepeat(String str) {
        int[] freq = new int[26];
        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            freq[ch - 'a']++;
        }
        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            if (freq[ch - 'a'] == 1) {
                return ch;
            }
        }
        return 'N';
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.print(printNonRepeat(str));
    }
}
