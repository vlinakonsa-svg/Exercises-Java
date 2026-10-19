package se.Lexicon;

import java.util.Scanner;

public class ConverterApp {

    // 1. Fixed constants for conversion rates
    public static final double RATE_USD = 10.87;
    public static final double RATE_EUR = 11.32;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // 2. Display the numbered main menu
            System.out.println("==================================");
            System.out.println("      LEXICON CONVERTER APP       ");
            System.out.println("==================================");
            System.out.println("1. Temperature Converter");
            System.out.println("2. Currency Converter");
            System.out.println("3. BMI Calculator");
            System.out.println("4. Exit");
            System.out.println("==================================");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();

            // 3. Handle main menu choices
            if (option == 1) {
                // --- Temperature Sub-Menu ---
                System.out.println("\n--- Temperature Converter ---");
                System.out.println("Convert:");
                System.out.println("  1. Celsius to Fahrenheit");
                System.out.println("  2. Fahrenheit to Celsius");
                System.out.print("Your choice: ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = cToF(celsius); // Call method
                    System.out.printf("Result: %.2f C = %.2f F%n", celsius, fahrenheit);
                } else if (choice == 2) {
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    double celsius = fToC(fahrenheit); // Call method
                    System.out.printf("Result: %.2f F = %.2f C%n", fahrenheit, celsius);
                }

            } else if (option == 2) {
                // --- Currency Sub-Menu ---
                System.out.println("\n--- Currency Converter ---");
                System.out.println("Convert:");
                System.out.println("  1. SEK to USD");
                System.out.println("  2. SEK to EUR");
                System.out.print("Your choice: ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.print("Enter amount in SEK: ");
                    double sek = scanner.nextDouble();
                    double usd = sekToUsd(sek); // Call method
                    System.out.printf("Result: %.2f SEK = %.2f USD%n", sek, usd);
                } else if (choice == 2) {
                    System.out.print("Enter amount in SEK: ");
                    double sek = scanner.nextDouble();
                    double eur = sekToEur(sek); // Call method
                    System.out.printf("Result: %.2f SEK = %.2f EUR%n", sek, eur);
                }

            } else if (option == 3) {
                // --- BMI Calculator ---
                System.out.println("\n--- BMI Calculator ---");
                System.out.print("Enter weight in kg: ");
                double weight = scanner.nextDouble();
                System.out.print("Enter height in metres: ");
                double height = scanner.nextDouble();

                double bmi = calculateBmi(weight, height); // Call method
                String category = checkBmiCategory(bmi);   // Call method
                System.out.printf("BMI: %.2f  ->  %s%n", bmi, category);

            } else if (option == 4) {
                // Exit choice
                running = false;
                continue;
            }

            // 4. Ask whether to continue or quit
            System.out.println();
            System.out.print("Continue? (yes/no): ");
            String answer = scanner.next();
            System.out.println();

            if (answer.equalsIgnoreCase("no")) {
                running = false;
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }

    // 5. Separate logic methods for conversions
    public static double cToF(double c) {
        return c * 9.0 / 5.0 + 32;
    }

    public static double fToC(double f) {
        return (f - 32) * 5.0 / 9.0;
    }

    public static double sekToUsd(double sek) {
        return sek / RATE_USD;
    }

    public static double sekToEur(double sek) {
        return sek / RATE_EUR;
    }

    public static double calculateBmi(double w, double h) {
        return w / Math.pow(h, 2);
    }

    public static String checkBmiCategory(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25.0) return "Normal weight";
        if (bmi < 30.0) return "Overweight";
        return "Obese";
    }
}