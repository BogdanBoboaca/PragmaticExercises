package MakingDecisions;

import java.util.Scanner;

public class MultistateSalesTaxCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the order amount? ");
        double amount = scanner.nextDouble();

        System.out.println("What is the state? ");
        String state  = scanner.next();

        if (state.equalsIgnoreCase("WI")){
            System.out.println("Please select a County");
            System.out.println("1. Eau Claire");
            System.out.println("2. Dunn");

            int county = scanner.nextInt();

            if (county == 1 ){
                double tax = 0.005;
                double taxValue = amount + tax;
                System.out.println("The subtotal is $" + amount );
                System.out.println("The tax is $" + tax);
                System.out.println("The total is $" + taxValue);
            }else if (county == 2){
                double tax = 0.004;
                double taxValue = amount + tax;
                System.out.println("The subtotal is $" + amount );
                System.out.println("The tax is $" + tax);
                System.out.println("The total is $" + taxValue);
            }

//            //System.out.println("Please enter the tax");
//            double tax = 0.50;
//            double taxValue = amount + tax;
//            System.out.println("The subtotal is $" + amount );
//            System.out.println("The tax is $" + tax);
//            System.out.println("The total is $" + taxValue);
        }else if (state.equalsIgnoreCase("IL")) {
            double tax = (amount * 8)/ 100;
            double taxValue = amount + tax;
            System.out.println("The subtotal is $" + amount );
            System.out.println("The tax is $" + tax);
            System.out.println("The total is $" + taxValue);
        }
    }

}
