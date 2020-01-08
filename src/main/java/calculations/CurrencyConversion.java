package calculations;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CurrencyConversion {


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the Currency that you want to convert: ");
//        System.out.println("1. Euro");
//        System.out.println("2. Dollars");
//        System.out.println("3. Pounds");
//        System.out.println("4. RON");

//        String number = scanner.next();
        DecimalFormat decimalFormat = new DecimalFormat("##.##");

        double value1 = getCurrencyFromUser();
        double value2 = getTheExchangeRate();
        double amount = value1 * value2;

        System.out.println(value1 + " euros at an exchange rate of " + value2 + " is " + decimalFormat.format(amount) + " U.S. dollars ");

//        if (number.equals("1")){
//            value2 = value1 * 1.36077;
//            System.out.println("You converted: " + value1 + " Dollars" + " to " + value2 + " Euro");
//        } else if (number.equals("2")){
//            value2 = value1 * 1.36077;
//            System.out.println("You converted: " + value1 + " Dollars" + " to " + value2 + " Euro");
//        }else if (number.equals("3")){
//            value2 = value1 * 1.36077;
//            System.out.println("You converted: " + value1 + " Dollars" + " to " + value2 + " Euro");
//        }else if (number.equals("4")){
//            value2 = value1 * 1.36077;
//            System.out.println("You converted: " + value1 + " Dollars" + " to " + value2 + " Euro");
//        }
    }

    private static double getCurrencyFromUser(){
        System.out.println("How many euros are you exchanging? ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static double getTheExchangeRate(){
        System.out.println("What is the exchange rate? ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

}
