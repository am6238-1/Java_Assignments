package Week_2;
import java.util.*;
public class ques2 {
    static String reverseEachWord(String sentence) {
   String[] word=sentence.split(" ");
   StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length; i++) {
            StringBuilder rev = new StringBuilder();

            for (int j = word[i].length() - 1; j >= 0; j--) {
                rev.append(word[i].charAt(j));
            }
            result.append(rev);
            if (i < word.length - 1)
                result.append(" ");
        }
        return result.toString();

    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(reverseEachWord(sentence));

    }
}
