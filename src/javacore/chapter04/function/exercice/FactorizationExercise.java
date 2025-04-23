package javacore.chapter04.function.exercice;

public class FactorizationExercise {

    public static void main(String[] args) {

        // Afficher les nombres de 1 à 5
        displayNumbers(1, 5);

        // Afficher la table de multiplication de 2
        displayMultiplicationTable(2);

        // Afficher la table de multiplication de 3
        displayMultiplicationTable(3);

        // Afficher la table de multiplication de 6
        displayMultiplicationTable(6);

        // Afficher les carrés des nombres de 1 à 5
        displaySquareNumbers(1, 5);

        // Afficher les carrés des nombres de 6 à 10
        displaySquareNumbers(6, 10);

    }


    // 1

    public static void displayNumber(int number) {

        System.out.println("Nombre: " + number);

    }

    public static void displayNumbers(int startNumber, int endNumber) {

        for (int i = startNumber; i <= endNumber; i++) {

            displayNumber(i);

        }
    }


    // 2

    public static void displayMultiplicationTable (int number) {

        System.out.println("Table de multiplication de " + number + " :");

        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " x " + i + " = " + (number * i));

        }

    }


    // 3

    public static void displaySquareNumbers(int startNumber, int endNumber) {

        System.out.println("Carrés des nombres de " + startNumber + " à " + endNumber + " :");
        for (int i = startNumber; i <= endNumber; i++) {
            System.out.println(i + " au carré = " + (i * i));
        }

    }

}
