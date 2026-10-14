import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        // Formulate Area and Circumference using Math.PI
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        // Print outputs formatted strictly to 2 decimal spots
        System.out.printf("Area         : %.2f\n", area);
        System.out.printf("Circumference: %.2f\n", circumference);

        scanner.close();
    }
}