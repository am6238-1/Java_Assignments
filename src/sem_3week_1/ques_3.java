package sem_3week_1;
import java.util.*;
public class ques_3 {
        static void findLongestStreak(String signalLog) {

            int currentStreak = 1;
            int longestStreak = 1;

            char longestColor = signalLog.charAt(0);

            for (int i = 1; i < signalLog.length(); i++) {

                if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {

                    currentStreak++;
                }
                else {

                    currentStreak = 1;
                }

                if (currentStreak > longestStreak) {

                    longestStreak = currentStreak;
                    longestColor = signalLog.charAt(i);
                }
            }

            System.out.println("Longest Streak: '"+longestColor + "' repeated " + longestStreak + " times");
        }

        static void main() {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter signal log:");

            String signalLog = sc.nextLine();

            findLongestStreak(signalLog);
        }
    }

