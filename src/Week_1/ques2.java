package Week_1;
import java.util.*;
public class ques2 {
    static void checkTypingAccuracy(String original, String typed) {
        int count = 0;
        int firstMismatch = -1;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                count++;
            }
            else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }
        System.out.println("Matched: " + count+"/"+original.length());
        double acc = (count * 100.0) / original.length();
        System.out.println("Accuracy: "+acc+"%");
        if (firstMismatch == -1) {
            System.out.println("No Mismatches");
        }
        else {
            System.out.println("First Mismatch at position "
                    + (firstMismatch + 1) + " ('"
                    + original.charAt(firstMismatch) + "' vs '"
                    + typed.charAt(firstMismatch) + "')");
        }
    }



        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            String original = "hello world";
            String typed = sc.nextLine();
            checkTypingAccuracy(original, typed);
        }
    }

