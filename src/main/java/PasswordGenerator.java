import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        // Comprehensive alphanumeric pool
        String pool = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder password = new StringBuilder();

        // Randomly select indices from the pool to construct the password
        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * pool.length());
            password.append(pool.charAt(randomIndex));
        }

        System.out.println("Generated password: " + password.toString());
        scanner.close();
    }
}