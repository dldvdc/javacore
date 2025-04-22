package javacore.chapter03.loop.exercise;

public class PrimeNumberSearcherV2 {

    public static void main(String[] args) {

        int primeNumberFound = 1;
        int iterations = 0;

        for ( int number = 1; primeNumberFound <= 50; number++ ) {

            int divisorCount = 0;

            for ( int divisor = 2; divisor < number; divisor++ ) {
               iterations++;
                if (number % divisor == 0) {
                    divisorCount++;
                    break;
                }
            }

            if (divisorCount == 0) {
                System.out.println(number + " est le Nombre Premier N°" + primeNumberFound);
                primeNumberFound++;
            }
        }
        System.out.println("Nombre d'itérations nécessaires: " + iterations);
    }
}
