package javacore.chapter03.loop.exercise;

public class MultiplicationTables {

    public static void main(String[] args) {

        for ( int a = 1 ; a < 10 ; a++ ) {

            System.out.print("Table de " + a + " : ");

            for ( int b = 1 ; b < 10 ; b++ ) {

                System.out.print( a + " x " + b + " = " + a * b + " ; " );

            }

            System.out.println();

        }

    }

}
