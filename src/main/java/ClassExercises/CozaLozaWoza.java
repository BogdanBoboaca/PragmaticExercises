package ClassExercises;

import org.w3c.dom.ls.LSOutput;

public class CozaLozaWoza {

    public static int main(String[] args) {
        int i;
        for (i = 1; i <= 110; i++){
            if (i % 3 == 0){
                System.out.print("Coza");
            }
            else if (i % 5 == 0){
                System.out.println("Loza");
            }
            else if (i % 7 == 0){
                System.out.println("Woza");
            }
            else if (i % 3 == 0 && i % 5 == 0){
                System.out.println("CozaLoza");
            }
            else if (i % 3 == 0 && i % 7 == 0){
                System.out.println("CozaWoza");
            }
        }
        return i;
    }

}
