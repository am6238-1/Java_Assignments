package sem_3week_1;
import java.util.*;
public class ques_5 {

        static void classifyWordLengths(String review) {

            String[] words = review.split(" ");

            int shortWords = 0;
            int medium = 0;
            int longWords = 0;

            for (String word : words) {

                int length = word.length();

                if (length >= 1 && length <= 4) {
                    shortWords++;
                } else if (length >= 5 && length <= 8) {
                    medium++;
                } else {
                    longWords++;
           }
            }

            System.out.println("Short: " +shortWords);
            System.out.println("Medium: " + medium);
            System.out.println("Long: " +longWords);
        }

        static void main() {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter movie review:");

            String review = sc.nextLine();

            classifyWordLengths(review);
        }
    }


