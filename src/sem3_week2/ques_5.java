package sem3_week2;
import java.util.*;
public class ques_5 {

        static void printFilteredWordFrequency(String feedback) {

            feedback = feedback.toLowerCase();

            feedback = feedback.replace(".", "");
            feedback = feedback.replace(",", "");

            String[] words = feedback.split("\\s+");

            String[] stopWords = {
                    "the", "was", "and", "a", "is", "of", "in"
            };

            String[] uniqueWords = new String[words.length];
            int[] counts = new int[words.length];

            int uniqueCount = 0;

            // Go through every word
            for (String word : words) {

                boolean isStopWord = false;

                // Check stop words
                for (String stopWord : stopWords) {

                    if (word.equals(stopWord)) {
                        isStopWord = true;
                        break;
                    }
                }

                // Skip stop word
                if (isStopWord) {
                    continue;
                }

                // Check whether word already exists
                int position = -1;

                for (int j = 0; j < uniqueCount; j++) {

                    if (uniqueWords[j].equals(word)) {
                        position = j;
                        break;
                    }
                }

                // If word already exists, increase count
                if (position != -1) {

                    counts[position]++;
                }

                // If word is new, add it
                else {

                    uniqueWords[uniqueCount] = word;
                    counts[uniqueCount] = 1;
                    uniqueCount++;
                }
            }

            // Sort by count in descending order
            for (int i = 0; i < uniqueCount - 1; i++) {

                for (int j = i + 1; j < uniqueCount; j++) {

                    if (counts[j] > counts[i]) {

                        // Swap counts
                        int tempCount = counts[i];
                        counts[i] = counts[j];
                        counts[j] = tempCount;

                        // Swap words
                        String tempWord = uniqueWords[i];
                        uniqueWords[i] = uniqueWords[j];
                        uniqueWords[j] = tempWord;
                    }
                }
            }

            // Display
            for (int i = 0; i < uniqueCount; i++) {

                System.out.println(uniqueWords[i] + ": " + counts[i]);
            }
        }

        static void main() {

            Scanner sc = new Scanner(System.in);

            String feedback = sc.nextLine();

            printFilteredWordFrequency(feedback);
        }
    }