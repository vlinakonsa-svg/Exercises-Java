import java.util.Scanner;

public class DiceStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rolls? ");
        int totalRolls = scanner.nextInt();

        int doublesCount = 0;

        for (int i = 1; i <= totalRolls; i++) {
            // Generate random values between 1 and 6
            int die1 = (int) (Math.random() * 6) + 1;
            int die2 = (int) (Math.random() * 6) + 1;
            int sum = die1 + die2;

            System.out.print("Roll " + i + ": " + die1 + " + " + die2 + " = " + sum);

            // Check if both dice have the same value
            if (die1 == die2) {
                System.out.println("  DOUBLE!");
                doublesCount++;
            } else {
                System.out.println();
            }
        }

        System.out.println("Doubles rolled: " + doublesCount + " out of " + totalRolls);
        scanner.close();
    }
}