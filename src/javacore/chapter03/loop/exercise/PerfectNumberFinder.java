package javacore.chapter03.loop.exercise;

public class PerfectNumberFinder {

    public static void main(String[] args) {


        // 1

        long start = 1L;
        long end = 33550336L;


        // 2

        for (long number = start ; number <= end ; number++ ) {

            long divisorSum = 0L;

            for ( long divisor = 1L; divisor < number; divisor++ ) {

                if (number % divisor == 0L) {

                    divisorSum += divisor;

                }
            }

            if ( divisorSum == number ) {

                System.out.println(number + " est un nombre parfait");

            }

        }

    }

}