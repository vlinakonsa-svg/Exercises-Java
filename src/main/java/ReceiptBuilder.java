import java.util.Scanner;

public class ReceiptBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder receiptItems = new StringBuilder();
        double grandTotal = 0;

        while (true) {
            System.out.print("Enter item name (or 'done'): ");
            String name = scanner.nextLine().trim();

            if (name.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter price: ");
            double price = Double.parseDouble(scanner.nextLine());
            grandTotal += price;

            // Format item rows dynamically: left-aligned for item name, right-aligned for values
            receiptItems.append(String.format("%-23s%7.2f\n", name, price));
        }

        System.out.println("\n==============================");
        System.out.println("           Receipt");
        System.out.println("==============================");
        System.out.print(receiptItems.toString());
        System.out.println("------------------------------");
        System.out.printf("%-23s%7.2f\n", "Grand Total:", grandTotal);
        System.out.println("==============================");

        scanner.close();
    }
}