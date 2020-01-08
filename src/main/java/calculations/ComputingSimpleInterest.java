package calculations;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class ComputingSimpleInterest {

    public static void main(String[] args) {

        double principal = getPrincipalFromUser();
        double investmentPercentageInDecimal = getTheRateOfInvestment() / 100;
        double period = getTheNumberOfYears();
        double amount = principal * (1 + investmentPercentageInDecimal * period);

        System.out.println("After " + period + " years at " + investmentPercentageInDecimal + "%, " + " the investment will be worth $" + amount);
    }

    private static int getPrincipalFromUser(){
        System.out.println("Enter the principal:  ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static double getTheRateOfInvestment(){
        System.out.println("Enter the rate of interest: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static int getTheNumberOfYears(){
        System.out.println("Enter the number of years: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
