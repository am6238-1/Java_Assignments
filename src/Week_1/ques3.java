package Week_1;
import java.util.*;
public class ques3 {
    static void findLongestStreak(String signalLog) {
        int count = 1;
        int longestStreak = 1;
        char longestColor = signalLog.charAt(0);

        for (int i = 1; i < signalLog.length(); i++) {

            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                count++;
            }
            else {
                count = 1;
            }

            if (count > longestStreak) {
                longestStreak = count;
                longestColor = signalLog.charAt(i);
            }
        }

        System.out.println("Longest Streak: '" + longestColor
                + "' repeated " + longestStreak + " times");
    }



public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        String signalLog=sc.nextLine();
    findLongestStreak(signalLog);
}

}
