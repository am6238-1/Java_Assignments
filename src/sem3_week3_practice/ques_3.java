package sem3_week3_practice;

public class ques_3 {

        static void main() {

            Course c1 = new Course(
                    "21CSC201J",
                    "Data Structures",
                    4
            );

            Course c2 = new Course(
                    "21CSC205L",
                    "DSA Lab",
                    3,
                    1
            );

            System.out.println(
                    c1.code + " total credits: " + c1.totalCredits()
            );

            System.out.println(
                    c2.code + " total credits: " + c2.totalCredits()
            );
        }
    }

    class Course {

        String code;
        String title;
        int credits;
        int labCredits;

        Course(String code, String title,
               int credits, int labCredits) {

            this.code = code;
            this.title = title;
            this.credits = credits;
            this.labCredits = labCredits;
        }

        Course(String code, String title, int credits) {

            this(code, title, credits, 0);
        }

        int totalCredits() {
            return credits + labCredits;
        }
    }