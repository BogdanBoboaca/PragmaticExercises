package Repetition;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNumberGame {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        do {
            GuessTheNumberGame guessTheNumberGame = new GuessTheNumberGame();
            guessTheNumberGame.play();
            System.out.print("Do you want to play again ([y] / n)? ");
            userInput = scanner.nextLine();
            System.out.println(userInput);
        } while (userInput.equals("y") || userInput.equals(""));

    }

    public void play() {
        System.out.println("Let's play Guess the Number.");
        System.out.println("Pick a difficulty level (1, 2, or 3): ");
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();
        if (level == 1) {
            levelOne();
        } else if (level == 2) {
            levelTwo();
        } else if (level == 3) {
            levelThree();
        } else System.out.println("Please select the level that you want to play.");
    }



    public void levelOne(){
        int randomNumber = ThreadLocalRandom.current().nextInt(1,10);
        System.out.println("I have my number. What's your guess? ");
        Scanner scanner = new Scanner(System.in);

        int guessed = scanner.nextInt();
        int i = 0;

        if (guessed != randomNumber){

            while (guessed != randomNumber) {
                i++;
                if (guessed > randomNumber) {
                    System.out.println("Too high. Guess again:");
                    guessed = scanner.nextInt();
                } else if (guessed < randomNumber) {
                    System.out.println("Too low. Guess again: ");
                    guessed = scanner.nextInt();
                }
                while (guessed == randomNumber) {
                    System.out.println("You got it in " + (1 + i++) + " guesses.");
                    break;
                }
            }
        }else {
            System.out.println("Well done, You guessed");
        }

    }

    public void levelTwo(){
        int randomNumber = ThreadLocalRandom.current().nextInt(1,100);
        System.out.println("I have my number. What's your guess? ");
        Scanner scanner = new Scanner(System.in);

        int guessed = scanner.nextInt();
        int i = 0;

        if (guessed != randomNumber){

            while (guessed != randomNumber) {
                i++;
                if (guessed > randomNumber) {
                    System.out.println("Too high. Guess again:");
                    guessed = scanner.nextInt();
                } else if (guessed < randomNumber) {
                    System.out.println("Too low. Guess again: ");
                    guessed = scanner.nextInt();
                }
                while (guessed == randomNumber) {
                    System.out.println("You got it in " + (1 + i++) + " guesses.");
                    break;
                }
            }
        }else {
            System.out.println("Well done, You guessed");
        }

    }

    public void levelThree(){
        int randomNumber = ThreadLocalRandom.current().nextInt(1,1000);
        System.out.println("I have my number. What's your guess? ");
        Scanner scanner = new Scanner(System.in);

        int guessed = scanner.nextInt();
        int i = 0;

        if (guessed != randomNumber){

            while (guessed != randomNumber) {
                i++;
                if (guessed > randomNumber) {
                    System.out.println("Too high. Guess again:");
                    guessed = scanner.nextInt();
                } else if (guessed < randomNumber) {
                    System.out.println("Too low. Guess again: ");
                    guessed = scanner.nextInt();
                }
                while (guessed == randomNumber) {
                    System.out.println("You got it in " + (1 + i++) + " guesses.");
                    break;
                }
            }
        }else {
            System.out.println("Well done, You guessed");
        }

    }
}
