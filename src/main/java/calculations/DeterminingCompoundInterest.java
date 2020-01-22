package calculations;

import java.util.Scanner;

public class DeterminingCompoundInterest {

    public static void main(String[] args) {

        double principal = getPrincipalFromUser();
        double investmentPercentageInDecimal = getTheRateOfInvestment() / 100;
        double period = getTheNumberOfYears();
        double interest = getTheNumberOfTimesTheInterest();
        double nt = interest * period;
        double calculation = principal * (1 + investmentPercentageInDecimal / interest);

        System.out.println(calculation);
        double amount = Math.pow(calculation,nt);

        System.out.println(principal + " invested at " + getTheRateOfInvestment() + "% for " + period +
                " years compounded " + interest + " times per year is : $ " + amount);
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
    private static int getTheNumberOfTimesTheInterest(){
        System.out.println("Enter the number of times the interest is compounded per year: " );
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
