package javacore.chapter03.loop.exercise;

public class PerfectNumberFinder {

    public static void main(String[] args) {


        // 1

        long start = 1L;
        long end = 33550336L;


        // 2

        for (long potentialPerfectNumber = start ; potentialPerfectNumber <= end ; potentialPerfectNumber++ ) {

            long divisorSum = 0L;

            for ( long divisor = 1L; divisor < potentialPerfectNumber; divisor++ ) {

                if (potentialPerfectNumber % divisor == 0L) {

                    divisorSum += divisor;

                }
            }

            if ( divisorSum == potentialPerfectNumber ) {

                System.out.println(potentialPerfectNumber + " est un nombre parfait");

            }

        }

    }

}