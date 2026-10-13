import java.util.Scanner;

public class Exc9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Using 9.0 instead of 9 ensures floating-point precision math
        double fahrenheit = celsius * 9.0 / 5 + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("Celsius:    %.1f °C%n", celsius);
        System.out.printf("Fahrenheit: %.1f °F%n", fahrenheit);
        System.out.printf("Kelvin:     %.2f K%n", kelvin);
    }
}