package sem_3week_1;
import java.util.*;
public class ques_4 {
        static void analyzeInventory(int[] sectionA, int[] sectionB) {

            int totalA = 0;
            int totalB = 0;


            for (int k : sectionA) {
                totalA = totalA + k;
            }

            for (int j : sectionB) {
                totalB = totalB + j;
            }

            String status;

            if (totalA == totalB) {
                status = "Balanced";
            }
            else {
                status = "Not Balanced";
            }
            int highest = sectionA[0];
            String highestSection = "Section A";
            int highestIndex = 0;

            for (int i = 0; i < sectionA.length; i++) {

                if (sectionA[i] > highest) {

                    highest = sectionA[i];
                    highestSection = "Section A";
                    highestIndex = i;
                }
            }

            for (int i = 0; i < sectionB.length; i++) {

                if (sectionB[i] > highest) {

                    highest = sectionB[i];
                    highestSection = "Section B";
                    highestIndex = i;
                }
            }

            System.out.println("Section A Total: " + totalA);
            System.out.println("Section B Total: " + totalB);
            System.out.println("Status: " + status);

            System.out.println("Highest Quantity: " + highest + " (" + highestSection + ", Item " + (highestIndex + 1) + ")");
        }
        static void main() {

            Scanner sc = new Scanner(System.in);

            int[] sectionA = new int[3];
            int[] sectionB = new int[3];

            System.out.println("Enter quantities for Section A:");

            for (int i = 0; i < sectionA.length; i++) {
                sectionA[i] = sc.nextInt();
            }

            System.out.println("Enter quantities for Section B:");

            for (int i = 0; i < sectionB.length; i++) {
                sectionB[i] = sc.nextInt();
            }

            analyzeInventory(sectionA, sectionB);
        }
    }

