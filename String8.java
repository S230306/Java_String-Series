
/*/*This is a Java program that takes a string as input and returns the same string with all its characters sorted in alphabetical order. */
import java.util.*;

public class String8 {
    public static void SortcharArray(char[] arr, int n) {
        for (int idx = 0; idx < n - 1; idx++) {
            for (int jdx = 0; jdx < n - idx - 1; jdx++) {
                // for reverse print
                // if (arr[jdx] < arr[jdx + 1]) {
                // for same print
                if (arr[jdx] > arr[jdx + 1]) {
                    char temp = arr[jdx];
                    arr[jdx] = arr[jdx + 1];
                    arr[jdx + 1] = temp;
                }
            }
        }
        // String res = new String(arr);
        StringBuilder res = new StringBuilder();
        res.append(arr);
        System.out.print(res);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char[] arr = str.toCharArray();
        int n = arr.length;
        SortcharArray(arr, n);
    }
}