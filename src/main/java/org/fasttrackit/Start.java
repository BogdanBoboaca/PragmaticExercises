package org.fasttrackit;

import java.util.Scanner;

public class Start {

    public void start (){


        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();

        if (number.equals ("1")){
            MathExercises sum = new MathExercises();
            sum.addition();
        }else if (number.equals("2")){
            MathExercises sub = new MathExercises();
            sub.subtraction();
        }else if (number.equals("3")){
            MathExercises multi = new MathExercises();
            multi.multiplication();
        }else if (number.equals("4")){
            MathExercises div = new MathExercises();
            div.division();
        }

    }
}
