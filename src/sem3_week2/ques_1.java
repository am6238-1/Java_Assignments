package sem3_week2;
import java.util.*;
public class ques_1 {

        static void checkPinLength(String pin) {

            int length = pin.length();

            if (length != 4) {
                System.out.println("Invalid PIN : must be exactly 4 digits.");
            }
            else {
                System.out.println("PIN length accepted.");
            }
        }

        static void main() {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter PIN: ");
            String pin = sc.nextLine();

            checkPinLength(pin);
        }
    }

