package sem3_week2_practice;

public class ques_4 {

        static String maskPhoneNumber(String phone) {

            if (phone.length() != 10) {
                return "Invalid phone number";
            }

            for (int i = 0; i < phone.length(); i++) {

                if (!Character.isDigit(phone.charAt(i))) {
                    return "Invalid phone number";
                }
            }

            StringBuilder result = new StringBuilder("XXXXXX");

            result.insert(6, "-");
            result.append(phone.substring(6));

            return result.toString();
        }

         static void main() {

            String phone = "9876543210";

            System.out.println(maskPhoneNumber(phone));
        }
    }
