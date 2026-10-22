import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- System Started ---");

        while (true) {
            System.out.print("\nEnter choice (test / exit): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Safe Exit Successful.");
                break;
            } else if (input.equals("test")) {
                System.out.println("Result: Test path works perfectly!");
            } else {
                System.out.println("Error: Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}
