package sem3_week3_practice;

public class ques_5 {

        static void main() {

            new Student("Ravi", 90);
            new Student("Anitha", 95);

            Student.printCollegeInfo();
        }
    }

    class Student {

        String name;
        int attendance;

        static String collegeName = "SRM Institute of Science and Technology";

        static int studentCount = 0;

        Student(String name, int attendance) {

            this.name = name;
            this.attendance = attendance;

            studentCount++;
        }

        static void printCollegeInfo() {

            System.out.println(collegeName);
            System.out.println("Students created: " + studentCount);
        }
    }
