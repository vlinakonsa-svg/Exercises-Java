import java.util.Scanner;

public class WordReverser {
    public static void main(String[] eloquence) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.next();

        StringBuilder sb = new StringBuilder(word);
        String reversed = sb.reverse().toString();

        System.out.println("Reversed: " + reversed);
        scanner.close();
    }
}