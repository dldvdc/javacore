package javacore.chapter02.condition.exercise;

public class NumberSignVerifier {

    public static void main(String[] args) {


        // 1 - 5 - 6??

        double number = -0.55 * 54;


        // 2

        if ( number > 0 ) {
            System.out.println("Le nombre " + number + " est positif.");
        }


        // 3

        else if ( number < 0 ) {
            System.out.println("Le nombre " + number + " est négatif.");
        }


        // 4

        else {
            System.out.println("Le nombre " + number + " est neutre.");
        }


        // 7

        System.out.println("\nImplémentation alternative :");

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isNeutral = number == 0;

        if (isPositive) {
            System.out.println("Le nombre " + number + " est positif.");
        } else if (isNegative) {
            System.out.println("Le nombre " + number + " est négatif.");
        } else if (isNeutral) {
            System.out.println("Le nombre " + number + " est neutre.");
        }

    }

}
