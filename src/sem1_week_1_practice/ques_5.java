package sem1_week_1_practice;
import java.util.Scanner;
public class ques_5 {

        static String reverseCustomerName(String customerName) {

            StringBuilder reversed = new StringBuilder();

            for (int i = customerName.length() - 1; i >= 0; i--) {
                reversed.append(customerName.charAt(i));
            }

            return reversed.toString();
        }

        static void main() {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter customer name: ");
            String customerName = sc.nextLine();

            String reversedName = reverseCustomerName(customerName);

            System.out.println("Original Name: " + customerName);
            System.out.println("Reversed Name: " + reversedName);

            sc.close();
        }
    }