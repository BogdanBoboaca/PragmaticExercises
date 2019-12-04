package calculations;

import java.util.Scanner;

public class PaintCalculator {

    public static void main(String[] args) {

        System.out.println("Welcome to the paint Calculator ");

        System.out.println("Please enter your length: ");

        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();

        System.out.println("Please enter your width: ");
        double width = scanner.nextDouble();

        double totalArea = length * width;

        int oneGallon = 350;

        int gallonsNeeded = (int) (totalArea / oneGallon);

        if (totalArea <= 350 ){
            System.out.println("You only need 1 gallon of paint to cover " + totalArea + " square feet");
        }else if (totalArea > 350){
            System.out.println("You will nee to purchase " + gallonsNeeded + " gallons of \n paint to cover " +
                    totalArea + " square feet" );
        }


    }

}
