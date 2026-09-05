package sem3_week4;

public class ques_5 {

        static void main() {

            Payment[] payments = { new CardPayment(), new Payment(), new CardPayment(), new Payment(), new CardPayment() };

            double[] amounts = {100, 50, 200, 75, 120};

            double totalCollected = 0;

            for (int i = 0; i < payments.length; i++) {

                if (payments[i] instanceof CardPayment) {

                    double chargedAmount =
                            amounts[i] * 1.02;

                    processTransaction(payments[i], amounts[i]);

                    totalCollected = totalCollected + chargedAmount;

                }
                else {

                    processTransaction(payments[i], amounts[i]);

                    totalCollected = totalCollected + amounts[i];
                }
            }

            System.out.println("Total Collected: Rs " +
                    totalCollected);
        }

        static void processTransaction(Payment payment, double amount) {

            if (payment instanceof CardPayment cardPayment) {

                cardPayment.payWithProcessingFee(amount);

            } else {

                payment.pay(amount);
            }
        }
    }

    class Payment {

        void pay(double amount) {
            System.out.println("Paid (cash): Rs " + amount);
        }
    }

    class CardPayment extends Payment {

        void payWithProcessingFee(double amount) {

            double total = amount + (amount * 0.02);

            System.out.println("Charged (card, incl. fee): Rs " + total);
        }
    }
