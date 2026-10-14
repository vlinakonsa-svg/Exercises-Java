import java.util.Scanner;

public class StringStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        String vowelList = "aeiouAEIOU";

        // Loop through each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isDigit(ch)) {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            } else if (Character.isLetter(ch)) {
                if (vowelList.indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels    : " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits    : " + digits);
        System.out.println("Spaces    : " + spaces);

        scanner.close();
    }
}