package sem_3_week5;

public class ques_4 {
    public static class MovieBookingProfile {

        private String name;
        private boolean confirmed;

        public MovieBookingProfile() {
        }

        public MovieBookingProfile(String name) {
            this();
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public boolean isConfirmed() {
            return confirmed;
        }

        public void setConfirmed(boolean confirmed) {
            this.confirmed = confirmed;
        }

        public void setOtp() {
        }

        static void main() {
            MovieBookingProfile p = new MovieBookingProfile("Rahul Dev");

            System.out.println(p.getName());

            p.setConfirmed(true);
            System.out.println(p.isConfirmed());

            p.setOtp();
        }
    }
}
