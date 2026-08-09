package Week_2;

import java.util.*;

public class ques5 {

    static void printFilteredWordFrequency(String feedback) {
        
        feedback = feedback.toLowerCase();
        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");
        String[] words = feedback.split("\\s+");

        
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        List<Map.Entry<String, Integer>> list = getEntries(words, stopWords);

        list.sort((a, b) -> b.getValue() - a.getValue());
        
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static List<Map.Entry<String, Integer>> getEntries(String[] words, String[] stopWords) {
        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            boolean isStopWord = false;

            for (String stop : stopWords) {
                if (word.equals(stop)) {
                    isStopWord = true;
                    break;
                }
            }

            if (isStopWord) {
                continue;
            }

            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);
            }
            else {
                frequency.put(word, 1);
            }
        }
        return new ArrayList<>(frequency.entrySet());
    }

    static void main() {

        Scanner sc = new Scanner(System.in);

        String feedback = sc.nextLine();

        printFilteredWordFrequency(feedback);
    }
}

