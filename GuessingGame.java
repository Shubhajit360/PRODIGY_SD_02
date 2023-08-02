import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    private static void playGuessingGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int generatedNumber = random.nextInt(100) + 1; 
        int attempts = 0;
        int userGuess;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Can you guess it?");

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == generatedNumber) {
                System.out.println("Congratulations! You guessed the number " + generatedNumber + " correctly!");
                System.out.println("It took you " + attempts + " attempts to win the game.");
                break;
            } else if (userGuess < generatedNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        } while (true);

        scanner.close();
    }
     public static void main(String[] args) {
        playGuessingGame();
    }
}
