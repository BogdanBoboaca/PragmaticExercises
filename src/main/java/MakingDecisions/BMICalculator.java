package MakingDecisions;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for Imperial Units.");
        System.out.println("Press 2 for Metric Units.");

        String temperature = scanner.next();

        if (temperature.equals("1")){
            imperialUnits();
        }else if (temperature.equals("2")){
           metricUnits();
        }

    }

    private static void imperialUnits (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Please enter your height: ");
        double height = scanner.nextDouble();
        double bmi = (weight / (height * height)) * 703;

        if (bmi <= 18.5){
            System.out.println("Please see your doctor, you are underweight, your bmi is: " + bmi);
        }else if (bmi >= 25) {
            System.out.println("Please see your doctor, you are overweight, your bmi is: " + bmi);
        }else {
            System.out.println("Well done, you are in a normal range, your bmi is: " + bmi);
        }
    }

    private static void metricUnits(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Please enter your height: ");
        double height = scanner.nextDouble();
        double bmi = ((weight / height) / height) ;

        if (bmi <= 18.5){
            System.out.println("Please see your doctor, you are underweight, your bmi is: " + bmi);
        }else if (bmi >= 25) {
            System.out.println("Please see your doctor, you are overweight, your bmi is: " + bmi);
        }else {
            System.out.println("Well done, you are in a normal range, your bmi is: " + bmi);
        }
    }
}
