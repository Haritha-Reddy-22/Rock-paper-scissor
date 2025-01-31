import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] rps = {"Rock", "Paper", "Scissors"};
        String computerMove, userMove;
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Enter move (Rock, Paper, Scissors). To exit the game, type \"exit\": ");
            userMove = scanner.nextLine();

            if (userMove.equalsIgnoreCase("exit")) {
                playAgain = false;
                break;
            }

            if (!userMove.equalsIgnoreCase("Rock") && !userMove.equalsIgnoreCase("Paper") && !userMove.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid move, please try again.");
                continue;
            }

            int computerChoice = random.nextInt(3);
            computerMove = rps[computerChoice];

            System.out.println("Computer move: " + computerMove);

            if (userMove.equalsIgnoreCase(computerMove)) {
                System.out.println("It's a tie!");
            } else if (userMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors") ||
                       userMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock") ||
                       userMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

        scanner.close();
        System.out.println("Thanks for playing!");
    }
}
