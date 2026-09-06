package sem3_week2_practice;

public class ques_2 {

        static void parseStudentRecord(String csvLine) {

            String[] fields = csvLine.split(",");

            if (fields.length != 3) {

                System.out.println("Invalid Record");

            } else {

                System.out.println(
                        "Name: " + fields[0] + " | Roll No: " + fields[1] + " | Dept: " + fields[2] );
            }
        }

        static void main() {

            String csvLine =
                    "Ananya Verma,RA2211003010123,CSE";

            parseStudentRecord(csvLine);
        }
    }
