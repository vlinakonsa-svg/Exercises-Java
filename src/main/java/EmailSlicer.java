import java.util.Scanner;

public class EmailSlicer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = scanner.next();

        // Find the position of the '@' symbol
        int atIndex = email.indexOf('@');

        // Check if the '@' symbol exists in the input
        if (atIndex != -1) {
            // Cut the string before and after the '@'
            String username = email.substring(0, atIndex);
            String domain = email.substring(atIndex + 1);

            System.out.println("Username: " + username);
            System.out.println("Domain  : " + domain);
        } else {
            System.out.println("Invalid email address format.");
        }

        scanner.close();
    }
}