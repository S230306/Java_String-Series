
/*This is a Java program that takes a string as input and returns the same string with all its characters sorted in alphabetical order. */
import java.util.*;

public class String7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            Integer count = map.get(c);
            if (count != null) {
                while (count > 0) {
                    output.append(c);
                    count--;
                }
                map.remove(c);
            }
        }
        System.out.println(output.toString());
    }
}
