package sem3_week2_practice;

public class ques_1 {

        static void countVowelsAndConsonants(String text) {

            int vowels = 0;
            int consonants = 0;

            for (int i = 0; i < text.length(); i++) {

                char ch = text.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' ||
                        ch == 'O' || ch == 'U') {

                    vowels++;

                } else if (ch != ' ') {
                    consonants++;
                }
            }

            System.out.println("Vowels: " + vowels +
                    " | Consonants: " + consonants);
        }

        static void main() {

            String text = "Java Programming";

            countVowelsAndConsonants(text);
        }
    }
