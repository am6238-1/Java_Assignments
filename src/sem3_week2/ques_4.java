package sem3_week2;
import java.util.*;
public class ques_4 {

        static String normalizeCode(String raw) {

            raw = raw.trim();

            String publisher = raw.substring(0, 3).toUpperCase();

            String rest = raw.substring(3);

            return publisher + rest;
        }

        static String validateAndFormat(String code) {

            if (code.length() != 13) {
                return "Invalid: wrong length";
            }

            // Check first 3 characters
            for (int i = 0; i < 3; i++) {

                if (!Character.isLetter(code.charAt(i))) {

                    return "Invalid: publisher code must be 3 letters";
                }
            }

            // Check remaining 10 characters
            for (int i = 3; i < 13; i++) {

                if (!Character.isDigit(code.charAt(i))) {

                    return "Invalid: body must contain only digits";
                }
            }

            return "[" + code.substring(0, 3) + "] YEAR: " +
                    code.substring(3, 7) + " | CATALOG: " + code.substring(7, 13);
        }


    static void main() {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter ISBN code: ");
            String raw = sc.nextLine();

            String normalized = normalizeCode(raw);

            String result = validateAndFormat(normalized);

            System.out.println(result);
        }
    }

