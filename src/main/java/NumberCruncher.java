import java.util.Scanner;

public class NumberCruncher {

    // Custom static method to locate the maximum value
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // Custom static method to locate the minimum value
    public static int findMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    // Custom static method to calculate the precision average
    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int n1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();
        System.out.print("Enter third number : ");
        int n3 = scanner.nextInt();

        System.out.println("Maximum : " + findMax(n1, n2, n3));
        System.out.println("Minimum : " + findMin(n1, n2, n3));
        System.out.printf("Average : %.2f\n", average(n1, n2, n3));

        scanner.close();
    }
}