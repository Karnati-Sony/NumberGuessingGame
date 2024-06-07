import java.util.Random;
import java.util.Scanner;
public class NumGuessingGame {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Random random = new Random();
            boolean playAgain = true;
            while (playAgain) {
                int numberToGuess = random.nextInt(100) + 1;
                int numberOfAttempts = 0;
                int guess;
                boolean hasGuessedCorrectly = false;
                System.out.println("Welcome to the Number Guessing Game! Glad to have you here!");
                System.out.println("I have selected a number between 1 and 100. Try to figure it out!");
                while (!hasGuessedCorrectly) {
                    System.out.print("Enter your guess: ");
                    guess = scan.nextInt();
                    numberOfAttempts++;

                    if (guess < numberToGuess) {
                        System.out.println("Too low! Give it another shot.");
                    } else if (guess > numberToGuess) {
                        System.out.println("Too high! Try again.");
                    } else {
                        System.out.println("Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");
                        hasGuessedCorrectly = true;
                    }

                }

                System.out.print("Do you want to play again? (yes/no): ");
                String userResponse = scan.next();

                if (userResponse.equalsIgnoreCase("no")) {
                    playAgain = false;
                }
            }

            System.out.println("Thank you for playing the Number Guessing Game.");
        }
    }
}
