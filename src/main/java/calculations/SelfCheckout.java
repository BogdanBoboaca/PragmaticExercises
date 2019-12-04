package calculations;

import java.util.Scanner;

public class SelfCheckout {
    public static void main(String[] args) {
        System.out.println("Welcome to the Self-Checkout ");

        System.out.println("Please enter the price of item 1: ");

        Scanner scanner = new Scanner(System.in);
        double item1 = scanner.nextDouble();

        System.out.println("Please enter the quantity of item 1: ");
        double quantity1  = scanner.nextDouble();

        System.out.println("Please enter the price of item 2: ");
        double item2 = scanner.nextDouble();

        System.out.println("Please enter the quantity of item 2: ");
        double quantity2  = scanner.nextDouble();

        System.out.println("Please enter the price of item 3: ");
        double item3 = scanner.nextDouble();

        System.out.println("Please enter the quantity of item 3: ");
        double quantity3  = scanner.nextDouble();

        double subtotal = (item1 * quantity1) + (item2 * quantity2) + (item3 + quantity3);

        double tax = (subtotal * 5.5) / 100;

        double total = subtotal + tax;

        System.out.println("Subtotal: " + subtotal );
        System.out.println("Tax: " + tax );
        System.out.println("Total: " + total );

    }
}
