import java.util.*;

/*Remove Dublicate from an string */
public class String6 {
    public static void PrintUnique(String str) {
        HashSet<Character> set = new HashSet<>();
        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            set.add(ch);
        }
        for (char x : set) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        PrintUnique(str);
    }

}
