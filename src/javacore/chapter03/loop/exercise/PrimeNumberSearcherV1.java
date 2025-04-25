package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcherV1 {

    public static void main(String[] args) {

        int primeNumberFound = 0;

        for ( int potentialPrimeNumber = 2; potentialPrimeNumber <= 100 && primeNumberFound < 5; potentialPrimeNumber++ ) {

            boolean isPrime = true;

            for ( int potentialDivisor = 2; potentialDivisor < potentialPrimeNumber; potentialDivisor++ ) {

                if (potentialPrimeNumber % potentialDivisor == 0) {

                    isPrime = false;

                }

            }

            if (isPrime) {

                System.out.println(potentialPrimeNumber + " est un nombre premier");

                primeNumberFound++;

            }

        }

    }

}
