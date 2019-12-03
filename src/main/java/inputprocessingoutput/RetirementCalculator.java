package inputprocessingoutput;

import java.time.LocalDate;

public class RetirementCalculator {
    public static void main(String[] args) {

        int currentAge = 29;
        int retirementAge = 65;

        int yearsLeft = retirementAge - currentAge;

        LocalDate createdDate = LocalDate.now();

        LocalDate retirementYear = LocalDate.now().plusYears(yearsLeft);
        System.out.println("What is your current age ? " + currentAge);
        System.out.println("At what age would you like to retire ? " + retirementAge);
        System.out.println("You have " + yearsLeft + " years left until you can retire.");
        System.out.println("it's " + createdDate + ", so you can retire in " + retirementYear);
    }
}
