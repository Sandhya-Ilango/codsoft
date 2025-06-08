import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static int generateRandomNumber(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    public static int getUserGuess(Scanner scanner) {
        System.out.print("Enter your Guess Number: ");
        return scanner.nextInt();
    }

    public static void playGame(int lowerBound, int upperBound, int maxAttempts) {
        Scanner sc = new Scanner(System.in);
        int numberToGuess = generateRandomNumber(lowerBound, upperBound);
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". Can you guess it?");

        while (attempts < maxAttempts) {
            int userGuess = getUserGuess(sc);
            attempts++;

            if (userGuess == numberToGuess) {
                System.out.println(" Congratulations! You've guessed the correct number in " + attempts + " attempts.");
                sc.close();
                return;
            } else if (userGuess < numberToGuess) {
                System.out.println(" Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + numberToGuess);
        System.out.println("Thanks for playing!");
        sc.close();
    }

    public static void main(String[] args) {
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;

        playGame(lowerBound, upperBound, maxAttempts);
    }
}



