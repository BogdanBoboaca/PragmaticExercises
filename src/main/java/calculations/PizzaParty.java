package calculations;

public class PizzaParty {
    public static void main(String[] args) {

        int people = 8;
        int pizzas = 2;

        int pieces = people * pizzas ;
        int piecesEachPerson = pieces / people;
        int pizzaLeft = piecesEachPerson % pizzas;

        System.out.println("How many people ? " + people);
        System.out.println("How many pizzas do you have ? " + pizzas);
        System.out.println(people + " people with " + pizzas + " pizzas");
        System.out.println("Each person gets " + piecesEachPerson + " pieces of pizza");
        System.out.println("There are " + pizzaLeft + " leftover pieces.");


    }
}
