package Repetition;

import java.util.Scanner;

public class AddingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("Enter a number: ");
            total += scanner.nextInt();

        }

        System.out.println("The total is : " + total);
    }
}
