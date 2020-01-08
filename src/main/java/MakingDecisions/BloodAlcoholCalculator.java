package MakingDecisions;

import java.util.Scanner;

public class BloodAlcoholCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How much alcohol have you consumed in ounces ");
        double alcohol = scanner.nextDouble();
        System.out.println("What is your body weight in pounds");
        double bodyWeight = scanner.nextDouble();
        System.out.println("What is your alcohol distribution ratio:");
        System.out.println("- 0.73 for men ");
        System.out.println("- 0.66 for women");
        double alcoholDistributionRatio = scanner.nextDouble();
        System.out.println("What is the number of hours since the last drink");
        double hours = scanner.nextDouble();

        double bac = (alcohol * 5.14 / bodyWeight * alcoholDistributionRatio) - .015 * hours;

        if (bac >= 0.08 ){
            System.out.println(bac + "It is not legal for you to drive.");
        }else{
            System.out.println(bac + "It is legal for you to drive.");
        }

    }
}
