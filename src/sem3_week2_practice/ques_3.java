package sem3_week2_practice;

public class ques_3 {

        static String validateFileExtension(String filename) {

            int dotPosition = filename.lastIndexOf('.');

            if (dotPosition == -1) {
                return "Rejected — invalid file type";
            }

            String extension =
                    filename.substring(dotPosition + 1);

            if (extension.equalsIgnoreCase("pdf") ||
                    extension.equalsIgnoreCase("docx") ||
                    extension.equalsIgnoreCase("zip")) {

                return "Accepted";

            } else {

                return "Rejected — invalid file type";
            }
        }

        static void main() {

            String filename = "Assignment1.PDF";

            System.out.println(validateFileExtension(filename));
        }
    }