package MakingDecisions;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int c = scanner.nextInt();

        if (a > b && a > b){
            System.out.println("The largest number is: " + a );
        }else if (b > a && b > c){
            System.out.println("The largest number is: " + b );
        }else if (c > a && c > b){
            System.out.println("The largest number is: " + c );
        }else{
            System.out.println("All numbers are the same");
        }
    }
}
