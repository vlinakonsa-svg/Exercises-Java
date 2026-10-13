import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int totalSeconds = scanner.nextInt();

        // Calculate hours, minutes, and remaining seconds
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // %02d ensures the numbers print with at least 2 digits (e.g., 05 instead of 5)
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}