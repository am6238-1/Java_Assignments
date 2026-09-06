package sem3_week2_practice;

public class ques_5 {

        static String normalizeReference(String raw) {

            raw = raw.trim();

            String bankCode =
                    raw.substring(0, 3).toUpperCase();

            String remaining =
                    raw.substring(3);

            return bankCode + remaining;
        }

        static String validateAndFormat(String reference) {

            if (reference.length() != 14) {
                return "Invalid: wrong length";
            }

            for (int i = 0; i < 3; i++) {

                if (!Character.isLetter(reference.charAt(i))) {
                    return "Invalid: bank code must be 3 letters";
                }
            }

            for (int i = 3; i < reference.length(); i++) {

                if (!Character.isDigit(reference.charAt(i))) {
                    return "Invalid: body must contain only digits";
                }
            }

            String bankCode = reference.substring(0, 3);
            String date = reference.substring(3, 9);
            String sequence = reference.substring(9);

            return "[" +
                    bankCode +
                    "] DATE: " +
                    date.substring(0, 2) +
                    "/" +
                    date.substring(2, 4) +
                    "/" +
                    date.substring(4, 6) +
                    " | SEQ: " +
                    sequence;
        }

        static void main() {

            String raw = " hdf03022600042 ";

            String normalized =
                    normalizeReference(raw);

            String result =
                    validateAndFormat(normalized);

            System.out.println(result);
        }
    }
