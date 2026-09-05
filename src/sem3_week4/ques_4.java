package sem3_week4;

public class ques_4 {

        static void main() {

            String[] names = {"Ananya", "Rohan", "Priya", "Arjun", "Sneha"};

            for (String name : names) {

                MembershipCard card =
                        new MembershipCard(name);

                System.out.println("Membership card issued: " + card.studentName);
            }
        }
    }

    class MembershipCard {

        static String libraryName;
        static String validUntil;

        String studentName;

        static {
            libraryName = "SRM Central Library";
            validUntil = "May 2027";

            System.out.println("Library info loaded");
        }

        MembershipCard(String studentName) {
            this.studentName = studentName;
        }
    }