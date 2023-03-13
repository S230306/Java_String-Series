
/*Write a program to find the first non-repeating character in a given string. */
import java.util.*;

public class String4 {
    public static void firstNonRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.get(ch) == 1) {
                System.out.print(ch);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        firstNonRepeatingChar(str);
    }
}
