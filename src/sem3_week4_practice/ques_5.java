package sem3_week4_practice;

public class ques_5 {

        static void main() {

            FeeAccount[] accounts = {
                    new HostelFeeAccount(),
                    new HostelFeeAccount(),
                    new FeeAccount(),
                    new FeeAccount()
            };

            int hostelCount = 0;
            int dayScholarCount = 0;

            for (FeeAccount account : accounts) {

                processPayment(account);

                if (account instanceof HostelFeeAccount) {
                    hostelCount++;
                } else {
                    dayScholarCount++;
                }
            }

            System.out.println(
                    "Hostel accounts processed: " + hostelCount +
                            " | Day-scholar accounts processed: " + dayScholarCount
            );
        }

        static void processPayment(FeeAccount account) {

            if (account instanceof HostelFeeAccount hostel) {

                hostel.payInInstallments();

            } else {

                account.payInOneGo();
            }
        }
    }

    class FeeAccount {

        void payInOneGo() {
            System.out.println("Paid in one go (day-scholar account)");
        }
    }

    class HostelFeeAccount extends FeeAccount {

        void payInInstallments() {
            System.out.println("Paid in two installments (hostel account)");
        }
    }
