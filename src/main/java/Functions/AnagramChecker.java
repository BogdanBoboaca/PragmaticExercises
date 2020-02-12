package Functions;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first string: ");
        String first = scanner.nextLine();

        System.out.println("Please enter the second string: ");
        String second = scanner.nextLine();

        String s1 = first.replaceAll("\\s","");
        String s2 = second.replaceAll("\\s", "");

        boolean status = true;

        if (s1.length() != s2.length()){
            status = false;
        }else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();

            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);

            status = Arrays.equals(ArrayS1,ArrayS2);
        }

        if (status){
            System.out.println(s1 + " and " + s2 + " are anagrams");
        }else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }
}
