
/*Write a Java program to check if a given string contains only digits. */
import java.util.*;

public class String13 {
    public static void checkString(String str) {
        // using the str.matches method.
        System.out.print((str.matches("[0-9]+") ? "only digit" : "not only digit"));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        checkString(str);
    }
}
