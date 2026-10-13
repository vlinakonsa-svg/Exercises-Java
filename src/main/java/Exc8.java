import java.util.Random;
import java.util.Scanner;

public class Exc8 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Generates a random number from 1 to 500
        int targetNumber = random.nextInt(500) + 1;
        int guess = 0;
        int guessCount = 0;

        // Loop runs indefinitely until the user guesses right
        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            guessCount++; // Increment counter for each attempt

            if (guess > targetNumber) {
                System.out.println("Too big!");
            } else if (guess < targetNumber) {
                System.out.println("Too small!");
            }
        }

        System.out.println("Correct! You got it in " + guessCount + " guesses.");
    }
}