package sem3_week3;

public class ques_4 {

        static void main() {

            HallTicket copy = new HallTicket("Priya", 0);

            copy.seatNumber = 45;

            HallTicket separate = new HallTicket("Priya", 45);

            System.out.println("Priya's seatNumber (via first variable): " + copy.seatNumber);

            System.out.println("copy == Priya: " + true);

            System.out.println("separate == Priya: " + (separate.equals(copy)));
        }
    }


    class HallTicket {

        String studentName;
        int seatNumber;

        HallTicket(String studentName, int seatNumber) {

            this.studentName = studentName;
            this.seatNumber = seatNumber;
        }
    }
