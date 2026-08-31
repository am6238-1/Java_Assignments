package sem_3week_1;
import java.util.*;
public class ques_1 {
        static void checkDuplicateSeats(int[] seatNumbers) {

            boolean duplicateFound = false;

            for (int i = 0; i < seatNumbers.length; i++) {

                for (int j = i + 1; j < seatNumbers.length; j++) {

                    if (seatNumbers[i] == seatNumbers[j]) {

                        System.out.println("Duplicate Seat Number Found: "
                                + seatNumbers[i]);

                        duplicateFound = true;
                    }
                }
            }

            if (!duplicateFound) {
                System.out.println("No Duplicate Seats Found");
            }
        }

        static void main() {

            Scanner sc = new Scanner(System.in);

            int[] seatNumbers = new int[5];

            System.out.println("Enter 5 seat numbers:");

            for (int i = 0; i < seatNumbers.length; i++) {
                seatNumbers[i] = sc.nextInt();
            }

            checkDuplicateSeats(seatNumbers);
        }
    }

