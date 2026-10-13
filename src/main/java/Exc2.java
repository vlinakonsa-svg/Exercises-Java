import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // A year is a leap year if it is divisible by 4 but NOT by 100,
        // UNLESS it is also divisible by 400.
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is NOT a leap year.");
        }
    }
}