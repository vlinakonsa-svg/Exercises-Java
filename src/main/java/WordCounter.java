import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence  : ");
        String sentence = scanner.nextLine();

        System.out.print("Enter word to find: ");
        String targetWord = scanner.next();

        // Split the sentence by spaces into an array of words
        String[] words = sentence.split("\\s+");
        int totalWords = words.length;
        int occurrenceCount = 0;

        for (String word : words) {
            // Strip out common trailing punctuation (like periods or commas) for precise matching
            String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "");
            if (cleanWord.equalsIgnoreCase(targetWord)) {
                occurrenceCount++;
            }
        }

        System.out.println("Total words : " + totalWords);
        System.out.println("\"" + targetWord + "\" appears: " + occurrenceCount + " times");

        scanner.close();
    }
}