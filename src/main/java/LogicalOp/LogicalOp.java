package LogicalOp;

import java.util.Scanner;

public class LogicalOp {
    public static void main(String[] args) {

       // getNumber();
       // negativeNumber();
        //intervalNumber();
        //higherNumber();
        //evenNumber();
        //unevenNumber();
        //System.out.println(addition());
//        System.out.println(mean());
        asterisk();
    }
    public static void getNumber(){
        System.out.println("Please enter the number that you'd like to start:  ");
        Scanner scanner = new Scanner(System.in);
        int number =  scanner.nextInt();

        for (int i = number; i <= 100; i++ ){
            System.out.println(i + " , " );
        }
    }

    public static void negativeNumber(){
        System.out.println("Please enter the number that you'd like to start:  ");
        Scanner scanner = new Scanner(System.in);
        int number =  scanner.nextInt();

        for (int i = number; i >= -100; i-- ){
            System.out.println(i + " , " );
        }
    }

    public static void intervalNumber(){
        System.out.println("Please enter the number that you'd like to start:  ");
        Scanner scanner = new Scanner(System.in);

        int number1 =  scanner.nextInt();
        System.out.println("Please enter the number that you'd like to finish: ");
        int number2 = scanner.nextInt();

        for (int i = number1; i <= number2; i++ ){
            System.out.println(i + ", " );
        }
    }

    public static void higherNumber(){
        System.out.println("Please enter the first number:  ");
        Scanner scanner = new Scanner(System.in);
        int number1 =  scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int number2 = scanner.nextInt();

        if (number1 < number2){
            for (int i = number1; i <= number2; i++ ){
            System.out.println(i + ", " );
            }
        }else {
            for (int i = number2; i <= number1; i++ ){
                System.out.println(i + ", " );
            }
        }
    }

    public static void evenNumber(){
        System.out.println("Please enter the number that you'd like to start:  ");
        Scanner scanner = new Scanner(System.in);
        int number =  scanner.nextInt();

        for (int i = number; i <= 100; i++ ){
            if (i % 2 == 0){
                System.out.println(i + " , " );
            }
        }
    }

    public static void unevenNumber(){
        System.out.println("Please enter the number that you'd like to start:  ");
        Scanner scanner = new Scanner(System.in);
        int number =  scanner.nextInt();

        for (int i = number; i <= 100; i++ ){
            if (i % 2 != 0){
                System.out.println(i + " , " );
            }
        }
    }

    public static int addition (){
        System.out.println("Please enter the number that you'll like to start:  ");
        Scanner scanner = new Scanner(System.in);
        int number =  scanner.nextInt();

        int total = 0;

        for (int i = number; i <= 100; i++ ){
            total = total + i;
        }

        return total;
    }

    public static double mean() {
        System.out.println("Please enter the number that you'll like to start:  ");
        Scanner scanner = new Scanner(System.in);
        int number =  scanner.nextInt();
        double average = 0;

        int count = 0;
        int i = 1;
        for (i = number; i <= 100; i++ ) {
            count++;
            average = average + i;
            System.out.println(i + ",       " + count + "     MEan      " + average);
        }

        System.out.println("Count: " + count);
        System.out.println("Average: " + average);
        average = average / count;



        return average;
    }

    public static String asterisk() {
        String x = "\"*******\"";
        System.out.println(x.substring(1, 8));
        for(int i = 7; i > 0; i--) {
            System.out.println(x.substring(8 - i, x.lastIndexOf("*")));
        }

        return "";
    }

}
