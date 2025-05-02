package javacore.chapter04.function.exercice;

public class RecursiveFibonacci {

    public static void main(String[] args) {

        displayFibonacciTerms(50);

    }


    public static void displayFibonacciTerms(int numberOfTerms) {

        System.out.print(" \n\nLes " + numberOfTerms + " premiers nombres de la suite de Fibonacci sont : ");

        recursiveFibonacciSuite(0L, 1L, numberOfTerms);

        System.out.println("\n");

    }


    public static void recursiveFibonacciSuite(long a, long b, int remaining) {

        if (remaining <= 0) {
            return;
        }

        System.out.print( a + " | " );

        remaining--;

        recursiveFibonacciSuite( b, a + b , remaining );

    }

}