package MakingDecisions;

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the order amount? ");
        double amount = scanner.nextDouble();

        System.out.println("What is the state? ");
        String state  = scanner.next();

        if (state.equals("WI")){

            System.out.println("Please enter the tax");
            double tax = scanner.nextDouble();
            double taxValue = amount + tax;
            System.out.println("The subtotal is $" + amount );
            System.out.println("The tax is $" + tax);
            System.out.println("The total is $" + taxValue);
        }else{
            System.out.println("The total is $" + amount);
        }
    }
}
