public class Exc3 {
    public static void main(String[] args) {
        // Item 1 variables
        String item1 = "Apple";
        int qty1 = 2;
        double price1 = 15.00;
        double total1 = qty1 * price1;

        // Item 2 variables
        String item2 = "Milk";
        int qty2 = 1;
        double price2 = 22.50;
        double total2 = qty2 * price2;

        // Item 3 variables
        String item3 = "Bread";
        int qty3 = 3;
        double price3 = 18.00;
        double total3 = qty3 * price3;

        // Calculate grand total
        double grandTotal = total1 + total2 + total3;

        // Print formatted receipt
        System.out.println("==============================");
        System.out.println("           Receipt            ");
        System.out.println("==============================");

        // %-12s prints text left-aligned in a 12-character wide block
        // %.2f prints a double with exactly 2 decimal places
        System.out.printf("%-12s %d x %.2f = %.2f SEK%n", item1, qty1, price1, total1);
        System.out.printf("%-12s %d x %.2f = %.2f SEK%n", item2, qty2, price2, total2);
        System.out.printf("%-12s %d x %.2f = %.2f SEK%n", item3, qty3, price3, total3);

        System.out.println("------------------------------");
        System.out.printf("Grand Total:           %.2f SEK%n", grandTotal);
        System.out.println("==============================");
    }
}