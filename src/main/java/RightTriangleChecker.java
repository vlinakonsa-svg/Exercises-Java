import java.util.Scanner;
import java.util.Arrays;

public class RightTriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] sides = new double[3];

        System.out.print("Enter side a: ");
        sides[0] = scanner.nextDouble();
        System.out.print("Enter side b: ");
        sides[1] = scanner.nextDouble();
        System.out.print("Enter side c: ");
        sides[2] = scanner.nextDouble();

        // Sorting puts the longest side (hypotenuse candidate) cleanly at index 2
        Arrays.sort(sides);
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];

        System.out.println("Longest side: " + c);

        // Small margin delta handles precision thresholds when squaring double types
        if (Math.abs((a * a + b * b) - (c * c)) < 0.0001) {
            System.out.println("This IS a right triangle.");
        } else {
            System.out.println("This is NOT a right triangle.");
        }

        scanner.close();
    }
}
