import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:  ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number:  ");
        int num3 = scanner.nextInt();

        // Dividing by 3.0 forces Java to perform double precision floating-point division
        double average = (num1 + num2 + num3) / 3.0;

        System.out.println("Average: " + average);
    }
}