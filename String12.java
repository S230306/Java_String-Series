
/*Write a Java program to count the number of vowels and consonants in a given string. */
import java.util.*;

public class String12 {
    public static void returnCountofVC(String str) {
        // count the Vowel.
        int Vcount = 0;
        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
                    || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                Vcount++;
            }
        }
        // count the Cansonent.
        int Ccount = 0;
        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'
                    && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                Ccount++;
            }
        }
        System.out.print(Vcount + " " + Ccount);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        returnCountofVC(str);

    }
}
