package Week_1;
import java.util.*;
 class ques5 {
    static void classifyWordLengths(String review) {

        String[] words = review.split(" ");

        int sCount = 0;
        int mCount = 0;
        int lCount = 0;

        for(int i = 0; i < words.length; i++) {

            int length = words[i].length();

            if (length >= 1 && length <= 4) {
                sCount++;
            }
            else if (length >= 5 && length <= 8) {
                mCount++;
            }
            else {
                lCount++;
            }
        }

        System.out.println("Short: "+sCount);
        System.out.println("Medium: "+mCount);
        System.out.println("Long: "+lCount);
    }

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        String review = sc.nextLine();

        classifyWordLengths(review);
    }
}

