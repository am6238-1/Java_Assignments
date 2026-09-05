package sem1_week_1_practice;
import java.util.Scanner;
public class ques_1 {

        static String playRound(String playerMove, String computerMove) {

            if (playerMove.equalsIgnoreCase(computerMove)) {
                return "Draw";
            }

            if ((playerMove.equalsIgnoreCase("Rock") &&
                    computerMove.equalsIgnoreCase("Scissors")) ||
                    (playerMove.equalsIgnoreCase("Paper") &&
                            computerMove.equalsIgnoreCase("Rock")) ||
                    (playerMove.equalsIgnoreCase("Scissors") &&
                            computerMove.equalsIgnoreCase("Paper"))) {

                return "Player Wins";
            }

            return "Computer Wins";
        }

        static void main() {

            Scanner sc = new Scanner(System.in);

            int rounds = 5;

            String[] playerMoves = new String[rounds];
            String[] computerMoves = new String[rounds];
            String[] results = new String[rounds];

            int wins = 0;
            int losses = 0;
            int draws = 0;

            for (int i = 0; i < rounds; i++) {

                System.out.print("Enter Rock, Paper or Scissors: ");
                playerMoves[i] = sc.nextLine();

                int randomNumber = (int)(Math.random() * 3);

                if (randomNumber == 0) {
                    computerMoves[i] = "Rock";
                } else if (randomNumber == 1) {
                    computerMoves[i] = "Paper";
                } else {
                    computerMoves[i] = "Scissors";
                }

                results[i] = playRound(playerMoves[i], computerMoves[i]);

                System.out.println("Computer: " + computerMoves[i]);
                System.out.println("Result: " + results[i]);
                System.out.println();

                if (results[i].equals("Player Wins")) {
                    wins++;
                } else if (results[i].equals("Computer Wins")) {
                    losses++;
                } else {
                    draws++;
                }
            }

            System.out.println("Final Summary");
            System.out.println("---------------------------------------------");
            System.out.println("Round | Player Move | Computer Move | Result");

            for (int i = 0; i < rounds; i++) {
                System.out.println((i + 1) + "     | " +
                        playerMoves[i] + "       | " +
                        computerMoves[i] + "       | " +
                        results[i]);
            }

            double winPercentage = (wins * 100.0) / rounds;

            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            System.out.println("Draws: " + draws);
            System.out.println("Win Percentage: " + winPercentage + "%");

            sc.close();
        }
    }
