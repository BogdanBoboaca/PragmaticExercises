package Repetition;

import java.util.Scanner;

public class HandlingBadInput {

    public static void main(String[] args) {
        HandlingBadInput handlingBadInput = new HandlingBadInput();
        handlingBadInput.investment();
    }


    public void investment(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the rate of return? ");

        try {
            int r = scanner.nextInt();
            if (r == 0) {
                System.out.println("Sorry. That's not a valid input.");
                investment();
            } else {
                int years = 72 / r;
                System.out.println("It will take " + years + " years to double your initial investment.");
            }
        }catch (Exception e){
            System.out.println("Sorry. That's not a valid input.");
            investment();
        }
    }

}

