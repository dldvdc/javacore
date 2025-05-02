package javacore.chapter04.function.project.refactor;

public class FunctionRefactorPrimeNumberSearcherV1 {

    public static void main(String[] args) {

        findPrimeNumbers(100);

    }

    public static void findPrimeNumbers(int searchLimitNumber) {

        int primeNumberFound = 0;

        for (int potentialPrimeNumber = 2; potentialPrimeNumber <= searchLimitNumber && primeNumberFound < 5; potentialPrimeNumber++) {

            boolean isPrime = isPrimeNumber(potentialPrimeNumber);

            if (isPrime) {

                System.out.println(potentialPrimeNumber + " est un nombre premier");
                primeNumberFound++;

            }

        }

    }

    public static boolean isPrimeNumber(int potentialPrimeNumber) {

        for (int potentialDivisor = 2; potentialDivisor < potentialPrimeNumber; potentialDivisor++) {

            if (potentialPrimeNumber % potentialDivisor == 0) {
                return false;
            }

        }

        return true;

    }

}
