package javacore.chapter03.loop.exercise;

public class FibonacciCalculator {

    public static void main(String[] args) {

        long a = 0L;
        long b = 1L;

        for ( int counter = 0 ; counter < 50 ; counter++ ) {

            if (a % 2 == 0) {
                System.out.print(a + " (even); ");
            } else {
                System.out.print(a + " ; ");
            }

            if (b % 2 == 0) {
                System.out.print(b + " (even); ");
            } else {
                System.out.print(b + " ; ");
            }

            a += b;
            b += a;

        }

    }

}
