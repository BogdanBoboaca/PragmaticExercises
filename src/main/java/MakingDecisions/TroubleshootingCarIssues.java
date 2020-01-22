package MakingDecisions;

import java.util.Scanner;

public class TroubleshootingCarIssues {

    public static void main(String[] args) {
        System.out.println("Please select 'y' for Yes and 'n' for No " );

        Scanner scanner = new Scanner(System.in);

        System.out.println("Is the car silent when turn the key? ");

        String answer = scanner.next();

        if (answer.equalsIgnoreCase("y")){
            System.out.println("Are the battery terminals corroded? ");
            String answer1 = scanner.next();
            if(answer1.equalsIgnoreCase("y")){
                System.out.println("Clean terminals and try start again. ");
            }else if(answer1.equalsIgnoreCase("n")){
                System.out.println("Replace cables and try again.");
            }
        }else if (answer.equalsIgnoreCase("n")){
            System.out.println("Does the car make a clicking noise? ");
            String answer1 = scanner.next();
            if(answer1.equalsIgnoreCase("y")){
                System.out.println("Replace the battery.");
            }else if (answer1.equalsIgnoreCase("n")){
                System.out.println("Does the car crank up but fail to start?");
                String answer2 = scanner.next();
                if(answer2.equalsIgnoreCase("y")){
                    System.out.println("Check spark plug connections.");
                }else if (answer2.equalsIgnoreCase("n")){
                    System.out.println("Does the engine start and then die? ");
                    String answer3 = scanner.next();
                    if(answer3.equalsIgnoreCase("y")){
                        System.out.println("Does your car have fuel injection ? ");
                        String answer4 = scanner.next();
                        if(answer4.equalsIgnoreCase("n"))
                            System.out.println("Check to ensure the choke is opening and closing.");
                        else if(answer4.equalsIgnoreCase("y")){
                            System.out.println("Get it in for service");
                        }
                    }
                }
            }
        }
    }
}
