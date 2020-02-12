package Functions;

import java.util.Scanner;

public class MonthsToPayOffACreditCard {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What is your balance?");
        double b = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("What is the APR on the card (as a percent)?");
        double i = scanner2.nextDouble();
        double apr = i / 365;

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("What is the monthly payment you can make?");
        double p = scanner3.nextDouble();

        double n = (-1/30)*(Math.log(1+b/p*(1-Math.pow((1+apr),30)))/Math.log(1+apr));
        n = (int)n;

        System.out.println("It will take you " + n + " months to pay off this card.");
    }

}
