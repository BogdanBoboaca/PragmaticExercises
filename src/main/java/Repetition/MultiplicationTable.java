package Repetition;

public class MultiplicationTable {

    public static void main(String[] args) {
        int a;
        int b;
        for (a = 0; a <= 12; ++a) {
            for (b = 0; b <= 12; ++b) {
                System.out.println(a + " x " + b + " = " + (a*b));
            }
        }
    }
}
