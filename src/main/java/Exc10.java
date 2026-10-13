public class Exc10 {
    public static void main(String[] args) {
        int a = 15;
        int b = 42;

        System.out.println("Before: a = " + a + ", b = " + b);

        // Arithmetic trick to swap values without a third variable
        a = a + b; // a becomes 57 (15 + 42)
        b = a - b; // b becomes 15 (57 - 42)
        a = a - b; // a becomes 42 (57 - 15)

        System.out.println("After:  a = " + a + ", b = " + b);
    }
}