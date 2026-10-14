import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.next();

        // Reverse the word using StringBuilder
        StringBuilder sb = new StringBuilder(word);
        String reversed = sb.reverse().toString();

        // Check if the original word matches the reversed word (ignoring case)
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }

        scanner.close();
    }
}