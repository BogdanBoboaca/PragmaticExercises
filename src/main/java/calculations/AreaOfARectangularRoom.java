package calculations;
public class AreaOfARectangularRoom {

    public static void main(String[] args) {

        int roomLength = 15;
        int roomWidth = 20;

        int squareFeet = roomLength * roomWidth;
        double squareMeters = squareFeet * 0.09290304;


        System.out.println("You entered dimensions of " + roomLength + " feet by " + roomWidth + " feet.");
        System.out.println("The area is: \n" + squareFeet + " square feet \n" + squareMeters + " square meters" );

    }
}
