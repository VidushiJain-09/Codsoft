import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        int totalAttempts = 7;
        int attempts = 0;
        boolean guessCorrect = false;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Guess the number between 1 and 100 in " + totalAttempts + " attempts");

        while (attempts < totalAttempts) {
            System.out.print("Enter your Guess: ");
            int guess = sc.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Invalid guess! Please enter a number between 1 and 100.");
                continue;
            }

            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congrats! You guessed it correct in " + attempts + " attempt(s).");
                guessCorrect = true;
                break;
            } else if (guess < randomNumber) {
                System.out.println("You guessed too low.");
            } else {
                System.out.println("You guessed too high.");
            }
            System.out.println("Attempts left: " + (totalAttempts - attempts));
        }

        if (!guessCorrect) {
            System.out.println("Oops! No attempts left. The correct number was " + randomNumber);
        }

        int score = 0;
        if (guessCorrect) {
            score = switch (attempts) {
                case 1 -> 100;
                case 2 -> 90;
                case 3 -> 75;
                case 4 -> 50;
                case 5 -> 35;
                case 6 -> 20;
                case 7 -> 10;
                default -> 0;
            };
        }

        System.out.println("Game Over!");
        System.out.println("Your Score is " + score);
        sc.close();
    }
}