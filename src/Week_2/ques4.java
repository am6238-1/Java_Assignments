package Week_2;
import java.util.*;
public class ques4 {

    static String normalizeCode(String raw) {
        raw = raw.trim();

        String first = raw.substring(0, 3).toUpperCase();
        String rest = raw.substring(3);

        return first + rest;
    }

    static String validateAndFormat(String code) {

        if (code.length() != 13) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: body must contain only digits";
            }
        }
        return "[" +
                code.substring(0, 3) +
                "] YEAR: " +
                code.substring(3, 7) +
                " | CATALOG: " +
                code.substring(7, 13);
    }

    static void main() {

        Scanner sc = new Scanner(System.in);

        String raw = sc.nextLine();

        String normalized = normalizeCode(raw);

        String result = validateAndFormat(normalized);

        System.out.println(result);
    }
}
