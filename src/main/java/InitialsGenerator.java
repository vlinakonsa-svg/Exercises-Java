import java.util.Scanner;

public class InitialsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine().trim();

        // Split the input string wherever there are one or more spaces
        String[] words = fullName.split("\\s+");
        StringBuilder initials = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Grab the first letter, capitalize it, and append a dot
                initials.append(Character.toUpperCase(word.charAt(0))).append(".");
            }
        }

        System.out.println("Initials: " + initials.toString());
        scanner.close();
    }
}