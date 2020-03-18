package Repetition;


import java.util.Scanner;

public class KarvonenHeartRate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age? ");
        int age = scanner.nextInt();
        System.out.println("What is your resting pulse? ");
        int restingHr = scanner.nextInt();

        System.out.println("Resting pulse: " + restingHr + "     Age:" + age);
        System.out.println();
        System.out.println("Intensity: " + "\t| Rate:");
        for (int intensity = 55; intensity <= 95; intensity += 5) {
            int targetHeartRate = (((220 - age) - restingHr) * intensity / 100) + restingHr;
            System.out.println(intensity + "%" + "\t        | " + targetHeartRate + " \tbpm");
        }
    }
}
