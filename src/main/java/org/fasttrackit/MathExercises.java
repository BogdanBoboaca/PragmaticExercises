package org.fasttrackit;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MathExercises {

    double number1 = getNumber1FromUser();
    double number2 = getNumber2FromUser();

    public void addition (){

        double sum = number1 + number2;

        System.out.println(sum);
    }

    public void subtraction(){

        double sub = number1 - number2;

        System.out.println(sub);
    }

    public void multiplication(){

        double multi = number1 * number2;

        System.out.println(multi);
    }

    public void division(){

        double div = number1 / number2;

        System.out.println(div);
    }

    private double getNumber1FromUser(){
        System.out.println("Please the first number. ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private double getNumber2FromUser() {
        System.out.println("Please enter the second number");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();

    }


}
