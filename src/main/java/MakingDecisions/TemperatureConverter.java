package MakingDecisions;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");

        String temperature = scanner.next();

        if (temperature.equals("C")){
            System.out.println("Please enter the temperature in Fahrenheit");
            int fahrenheit = scanner.nextInt();
            int c = (fahrenheit - 32)* 5/9;
            System.out.println("The temperature is: " + c);
        }else if (temperature.equals("F")){
            System.out.println("Please enter the temperature in Celsius");
            int celsius = scanner.nextInt();
            int f = (celsius * 9/5) + 32;
            System.out.println("The temperature is: " + f);
        }
    }
}
