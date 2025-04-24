package javacore.chapter04.function.exercice;

public class RecursiveFibonacci {

    public static void main(String[] args) {

        displayFibonacciTerms(50);

    }


    // Fonction d'affichage des termes de la Suite de Fibonacci

    public static void displayFibonacciTerms(int numberOfTerms) {

        System.out.print(" \n\nVoici les " + numberOfTerms + " premiers nombres de la suite de Fibonacci : ");

        generateFibonacciSuite(0L, 1L, numberOfTerms);

        System.out.println("\n");

    }


    // Fonction de génération par récursivité de la Suite de Fibonacci

    public static void generateFibonacciSuite(long a, long b, int remaining) {

        if (remaining == 0) {

            return;

        }

        System.out.print( a + " | " );

        remaining--;

        generateFibonacciSuite(b, a + b , remaining);

    }

}