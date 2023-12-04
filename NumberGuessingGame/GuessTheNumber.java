package task_1;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
    	
    	
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("--------------------");
        System.out.println("Welcome to the number game");
        System.out.println("1) Play the Game");
        System.out.println("2) Score Board");
        System.out.println("3) Exit the game");
        System.out.println("--------------------");
        
        
        int maxAttempts = 5; // Maximum number of attempts
        int points = 0; // Initialize points

        // Start the game loop
        while (true) {
            int numberToGuess = random.nextInt(100) + 1; // Generate a random number between 1 and 100

            int attempts = 0; // Initialize attempts
            int guess; // Variable to store user's guess

            // Game loop for each round
            while (attempts < maxAttempts) {
                System.out.println("Enter your guess (between 1 and 100): ");
                guess = scanner.nextInt();

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number!");
                    points += 10; // Add points for correct guess
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }

                attempts++; // Increment the number of attempts
            }

            // Check if attempts limit reached
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you ran out of attempts.");
            }

            // Ask if the user wants to play another round
            System.out.println("Do you want to play again? (Y/N): ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("Y")) {
                System.out.println("Your total points: " + points);
                System.out.println("Thank you for playing!");
                break;
            }
        }
    }
}

