package inputprocessingoutput;

import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 5;

        int sum = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 - number2;

        System.out.println("What is the first number? " + number1 + "\n" +
                "What is the second number? " + number2 + "\n" +
                number1 + " + " + number2 + " = " + sum + "\n" +
                number1 + " - " + number2 + " = " + subtraction + "\n" +
                number1 + " * " + number2 + " = " + multiplication + "\n" +
                number1 + " / " + number2 + " = " + division );

    }
}
