package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcherV1 {

    public static void main(String[] args) {

        int primeNumberFound = 0;

        for ( int number = 1; number <= 100 && primeNumberFound <= 5; number++ ) {

            int divisorCount = 0;

            for ( int divisor = 2; divisor < number; divisor++ ) {
                if (number % divisor == 0) {
                    divisorCount++;
                }
            }

            if (divisorCount == 0) {
                System.out.println(number + " est un nombre premier");
                primeNumberFound++;
            }

        }

    }

}
