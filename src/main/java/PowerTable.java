import java.util.Scanner;

public class PowerTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = scanner.nextInt();

        // Loop from 1 up to 10 to calculate each power
        for (int i = 1; i <= 10; i++) {
            double result = Math.pow(base, i);
            // %-2d left-aligns the exponent; %10.1f aligns the decimal values beautifully
            System.out.printf("%d ^ %-2d = %10.1f\n", base, i, result);
        }

        scanner.close();
    }
}