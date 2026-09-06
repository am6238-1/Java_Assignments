package sem3_week4_practice;

public class ques_4 {

         static void main() {

            String[] names = {"Ravi", "Meera", "Karthik", "Divya", "Anitha"
            };

            for (String name : names) {
                Student student = new Student(name);
                student.printConfirmation();
            }
        }
    }

    class Student {

        static String collegeName;
        static String academicYear;

        String name;

        static {
            collegeName = "SRM Institute of Science and Technology";
            academicYear = "2026-2027";

            System.out.println("College info loaded");
        }

        Student(String name) {
            this.name = name;
        }

        void printConfirmation() {
            System.out.println("Student record created: " + name);
        }
    }
