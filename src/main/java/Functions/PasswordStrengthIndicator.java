package Functions;

import java.util.Scanner;

public class PasswordStrengthIndicator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password");

        String password = scanner.nextLine();

        if (calculatePasswordStrength(password) < 3 ){
            System.out.println("The " + password + " is a very weak password, it ranks at: " + calculatePasswordStrength(password));
        }else if (calculatePasswordStrength(password) < 6 ){
            System.out.println("The " + password + " is weak password it ranks at: " + calculatePasswordStrength(password));
        }else if (calculatePasswordStrength(password) < 8){
            System.out.println("The " + password + " is a strong password it ranks at: " + calculatePasswordStrength(password));
        }else if (calculatePasswordStrength(password) <= 10){
            System.out.println("The " + password + " is a very strong password it ranks at: " + calculatePasswordStrength(password));
        }

    }

    private static int calculatePasswordStrength (String password){
        int iPasswordScore = 0;

        if (password.length() < 4){
            return 0;
        }else if (password.length() >= 8){
            iPasswordScore += 2;
        }else {
            iPasswordScore += 1;
        }

        if (password.matches("(?=.*[0-9]).*")){
            iPasswordScore += 2;
        }
        if (password.matches("(?=.*[a-z]).*")){
            iPasswordScore += 2;
        }
        if (password.matches("(?=.*[A-Z]).*")){
            iPasswordScore += 2;
        }
        if (password.matches("(?=.*[~!@#$%^&*()_-]).*")){
            iPasswordScore += 2;
        }

        return iPasswordScore;
    }
}
