
/*Write a program to count the number of vowels in a given string. */
import java.util.*;

public class String3 {
    public static int CountofVowel(String str) {
        int count = 0;
        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
                    || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.print(CountofVowel(str));
    }
}
