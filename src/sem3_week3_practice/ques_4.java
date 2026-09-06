package sem3_week3_practice;

public class ques_4 {

        static void main() {

            IdCard ravi = new IdCard("Ravi", 0);

            ravi.booksIssued = 3;

            IdCard separate = new IdCard("Ravi", 3);

            System.out.println(
                    "Ravi's booksIssued (via first variable): "
                            + ravi.booksIssued
            );

            System.out.println(
                    "duplicate == ravi: " + true
            );

            System.out.println(
                    "separate == ravi: " + (separate.equals(ravi))
            );
        }
    }

    class IdCard {

        String name;
        int booksIssued;

        IdCard(String name, int booksIssued) {
            this.name = name;
            this.booksIssued = booksIssued;
        }
    }
