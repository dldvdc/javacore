package javacore.chapter02.condition.exercise;

public class NumberComparison {

    public static void main(String[] args) {

        // 1

        int number1 = -456;
        int number2 = -556;
        System.out.println("\nLes deux nombres proposés sont : " + number1 + " et " + number2);


        // 2

        if ( number1 > number2 ) {
            System.out.println("Le nombre " + number1 + " est le plus grand des deux nombres");
        } else if ( number2 > number1 ) {
            System.out.println("Le nombre " + number2 + " est le plus grand des deux nombres");
        } else {
            System.out.println("Les deux nombres sont égaux, il n'y a donc pas de plus grand");
        }

    }

}
