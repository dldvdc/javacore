package javacore.chapter03.loop.exercise;

public class PerfectNumberFinder {

    public static void main(String[] args) {


        // 1

        long start = 1L;
        long end = 33550336L;


        // 2

        for (long potentialPerfectNumber = start ; potentialPerfectNumber <= end ; potentialPerfectNumber++ ) {

            long divisorSum = 0L;

            for ( long potentialDivisor = 1L;  potentialDivisor < potentialPerfectNumber;  potentialDivisor++ ) {

                if (potentialPerfectNumber %  potentialDivisor == 0L) {

                    divisorSum +=  potentialDivisor;

                }
            }

            if ( divisorSum == potentialPerfectNumber ) {

                System.out.println(potentialPerfectNumber + " est un nombre parfait");

            }

        }

    }

}