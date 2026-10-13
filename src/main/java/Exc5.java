import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name:  ");
        String lastName = scanner.nextLine();

        // Concatenates strings using the + operator
        System.out.println("Hello, " + firstName + " " + lastName + "! Welcome aboard.");
    }
}