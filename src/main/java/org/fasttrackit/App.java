package org.fasttrackit;


public class App 
{
    public static void main( String[] args ) {

        System.out.println("Starting our calculation project: ");

        System.out.println("Please enter the operation that you're interested in :" );
        System.out.println("For Addition please press 1." );
        System.out.println("For Subtraction please press 2." );
        System.out.println("For Multiplication please press 3." );
        System.out.println("For Division please press 4." );


        Start calculator = new Start();
        calculator.start();



    }
}
