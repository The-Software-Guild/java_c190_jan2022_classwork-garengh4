import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    static Scanner sc = new Scanner(System.in);
    static int playerScore = 0;

    public static boolean checkRounds(int rounds) {
        if (rounds < 1 || rounds > 10) {
            return false;
        }
        return true;
    }

    public static String convertChoice(int input) {
        if (input == 1) {
            return "Rock";
        } else if (input == 2) {
            return "Paper";
        } else if(input==3) {
            return "Scissors";
        } else{
            return "Error: convertChoice";
        }
    }

    public static int findWinner(String playerChoice, String computerChoice) {
        System.out.println("Player choice: " + playerChoice);
        System.out.println("Computer choice: " + computerChoice);

        if (playerChoice.equals(computerChoice)) {
            System.out.println("Result: tie\n");
        } else if (playerChoice.equals("Rock") && computerChoice.equals("Paper")) {
            System.out.println("Result: You lost.\n");
            playerScore--;
        } else if (playerChoice.equals("Rock") && computerChoice.equals("Scissors")) {
            System.out.println("Result: you won.\n");
            playerScore++;
        } else if (playerChoice.equals("Paper") && computerChoice.equals("Rock")) {
            System.out.println("Result: You won\n");
            playerScore++;
        } else if (playerChoice.equals("Paper") && computerChoice.equals("Scissors")) {
            System.out.println("Result: You lost\n");
            playerScore--;
        } else if (playerChoice.equals("Scissors") && computerChoice.equals("Rock")) {
            System.out.println("Result: You lost\n");
            playerScore--;
        } else if (playerChoice.equals("Scissors") && computerChoice.equals("Paper")) {
            System.out.println("Result: You won\n");
            playerScore++;
        }
        return playerScore;
    }
    public static boolean checkPlayAgain(){
        System.out.println("Play again? Y/N");
        String input = sc.next();
        if(input.equals("Y")){
            return true;
        }
        return false;
    }

    public static void play() {
        System.out.print("How many rounds? ");
        int rounds = sc.nextInt();

        if (!checkRounds(rounds)) {
            System.err.println("Error: Invalid input");
            System.exit(0);
        }

        for (int i = 0; i < rounds; i++) {
            // Ask user for rock paper scissor input.
            System.out.print("Make your choice: ");
            int player = sc.nextInt();
            String playerChoice = convertChoice(player);

            Random rand = new Random();
            int computer = rand.nextInt(3) + 1;
            String computerChoice = convertChoice(computer);
            int score = findWinner(playerChoice, computerChoice);
            System.out.println("your overall score is: " + score);

        }
    }

    public static void main(String[] args) {
        // How many rounds? if rounds is between 1 and 10, else error message + exit.
        play();
        while (checkPlayAgain()) {
            play();
        }

        // computer generates roc paper scissor input. Display round result. Update
        // scoreboard. Increment roundNum

        // Ask user for rock paper scissor input.

        // computer generates roc paper scissor input. Display round result. Update
        // scoreboard. Increment roundNum

        // if roundNum = rounds, end game. Display scoreboard. Ask user if restart

    }
}