import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:  ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        // Calculate and print basic arithmetic operations
        System.out.println(first + " + " + second + " = " + (first + second));
        System.out.println(first + " - " + second + " = " + (first - second));
        System.out.println(first + " * " + second + " = " + (first * second));

        // Casting the first integer to a double to ensure a decimal division result
        System.out.println(first + " / " + second + " = " + ((double) first / second));
    }
}