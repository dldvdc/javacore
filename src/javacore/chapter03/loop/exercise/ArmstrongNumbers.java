package javacore.chapter03.loop.exercise;

public class ArmstrongNumbers {

    public static void main(String[] args) {


        // Nombre test

        int potentialAmstrongNumber = 153;


        // Obtention de la puissance

        int power = 0;

        for (int i = potentialAmstrongNumber ; i > 0; i /= 10) {
            power++;
        }


        // Somme des nombres en puissance

        int sumOfPoweredNumber = 0;

        for (int b = potentialAmstrongNumber ; b > 0; b /= 10) {

            int isolatedNumber = b % 10;
            int poweredNumber = 1;

            for (int i = 0 ; i < power ; i++) {
                poweredNumber *= isolatedNumber;
            }

            sumOfPoweredNumber += poweredNumber;

        }

        // Affichage du Resultat

        if ( sumOfPoweredNumber == potentialAmstrongNumber ) {
            System.out.println(potentialAmstrongNumber + " est un nombre narcissique !");
        } else {
            System.out.println(potentialAmstrongNumber + " n'est pas un nombre narcissique.");
        }

    }

}
