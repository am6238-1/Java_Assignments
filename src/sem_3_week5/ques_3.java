package sem_3_week5;

public class ques_3 {
    public static class CineScreen {

        private final int seatsTotal;
        private int seatsAvailable;

        public CineScreen(int seatsTotal) {
            if (seatsTotal <= 0)
                throw new IllegalArgumentException("Invalid seat count");

            this.seatsTotal = seatsTotal;
            this.seatsAvailable = seatsTotal;
        }

        public void bookSeat() {
            if (seatsAvailable > 0)
                seatsAvailable--;
        }

        public void cancelBooking() {
            if (seatsAvailable < seatsTotal)
                seatsAvailable++;
        }

        public int getSeatsAvailable() {
            return seatsAvailable;
        }

        static void main() {
            CineScreen c = new CineScreen(2);

            c.bookSeat();
            c.bookSeat();
            c.bookSeat();

            System.out.println(c.getSeatsAvailable());

            c.cancelBooking();
            c.cancelBooking();
            c.cancelBooking();

            System.out.println(c.getSeatsAvailable());
        }
    }
}