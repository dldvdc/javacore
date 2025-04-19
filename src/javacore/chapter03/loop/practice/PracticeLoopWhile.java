package javacore.chapter03.loop.practice;

public class PracticeLoopWhile {

    public static void main (String[] args) {


        int age = 15;

        if ( age < 18 ) {
            System.out.println("Condition : age = " + age);
            age = 8;
        }

        while ( age < 18 ) {
            System.out.println("Boucle : age = " + age);
            age++;
        }

        System.out.println("On est sorti de la boucle while");


        // ---------------------------------------------- //


        int resultBadWay = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;

        System.out.println("Resultat : " + resultBadWay);

        int result = 0;
        int currentNumber = 1;
        int maxNumber = 100;

        while ( currentNumber <= maxNumber) {

            System.out.println("Result = " + result + " + " + currentNumber);

            result += currentNumber;

            System.out.println("-----> " + result);

            currentNumber++;

        }

        System.out.println("\nLa somme des nombres de 1 à " + maxNumber + " = " + result);

    }

}
