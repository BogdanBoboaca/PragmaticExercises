package Functions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidatingInputs {

    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);

    public static void main(String[] args) {

        ValidatingInputs validatingInputs = new ValidatingInputs();
        validatingInputs.input();



    }

    public void input(){
        System.out.println("Enter the First Name: ");
        if (firstName()){
            System.out.println("Enter the Last Name: ");
            if (lastName()){
                System.out.println("Enter the ZIP code:");
                if (zipCode()){
                    System.out.println("Enter an employee ID: ");
                    if (id()){
                        System.out.println("There were no errors found.");
                    }else {
                        input();
                    }
                }else {
                    input();
                }
            }else {
                input();
            }
        }else {
            input();
        }

    }

    public boolean firstName(){
        String firstName = scanner.nextLine();

        if (firstName.length() < 2) {
            System.out.println(firstName + " is not a valid first name. It is too short. ");
            return false;
        }else if (firstName.matches("(.*)[0-9](.*)")) {
            System.out.println("Please enter a valid first name");
            return false;
        }
        return true;
    }

    public boolean lastName(){
        String lastName = scanner.nextLine();

        if (lastName.length() < 2) {
            System.out.println(lastName + " is not a valid Last Name. It is too short. ");
            return false;
        }else if (lastName.matches("(.*)[0-9](.*)")) {
            System.out.println("Please enter a valid Last Name");
            return false;
        }
        return true;
    }

    public boolean zipCode(){

        try {
            int zipCode = scanner.nextInt();

            int zip = String.valueOf(zipCode).length();

            if (zip != 5) {
                System.out.println("Please enter a valid Zip Code");
                return false;
            }
        }catch (InputMismatchException e){
            System.out.println("Please enter a valid Zip Code");
            return false;
        }

        return true;
    }

    public boolean id(){
        String id = scanner2.nextLine();
        boolean id2 = id.matches("\\b[A-Z][A-Z]\\b" + "-" + "\\b[1-9][1-9][1-9]\\b");
        if(!id2){
            System.out.println("Please enter a valid ID");
            return false;
        }
        return true;
    }
}
