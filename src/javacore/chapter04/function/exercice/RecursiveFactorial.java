package javacore.chapter04.function.exercice;

public class RecursiveFactorial {
    
    public static void main(String[] args) {
    
    displayFactorial(20);

    }
    

    public static void displayFactorial(int number) {

        long factorial = calculateFactorial(number, 1L);

        if (factorial == -1) {

            System.out.println("\nLa valeur de la factorielle de " + number + " est trop grande pour être stockée dans un type long...\n");

            return;

        }

        System.out.println("\nLa factorielle de " + number + " est " + factorial + "\n");

    }


    public static long calculateFactorial(int number, long factor) {

        if (factor < 0) return -1; // Gestion de l'overflow pour le type long

        else if (number >= 1) {

            factor *= number;
            number--;

            factor = calculateFactorial( number , factor );

        }

        return factor;

    }

}