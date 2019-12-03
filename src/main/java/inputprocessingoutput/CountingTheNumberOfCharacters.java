package inputprocessingoutput;

import java.util.Scanner;

public class CountingTheNumberOfCharacters {

    public static void main(String[] args) {

        System.out.println("What is the input string? ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println(name + " has " + name.length() + " characters");

    }
}
