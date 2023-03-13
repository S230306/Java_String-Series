
/* Print common word together */
import java.util.*;

public class String5 {

    public static void main(String[] args) {
        String str = "Please call me at your earliest convenience. I am available all day for your call.";
        String[] words = str.split(" ");

        for (String word : words) {
            if (word.endsWith("call")) {
                System.out.println(word);
            }
        }
    }
}
